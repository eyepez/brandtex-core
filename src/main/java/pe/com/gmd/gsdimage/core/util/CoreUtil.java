package pe.com.gmd.gsdimage.core.util;

import com.itextpdf.text.pdf.PdfReader;
import com.sun.media.jai.codec.FileSeekableStream;
import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageDecoder;
import com.sun.media.jai.codec.SeekableStream;
import pe.com.gmd.bpo.util.date.FechaUtil;
import pe.com.gmd.bpo.util.exception.GmdException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CoreUtil {
	
	private CoreUtil() { }

	/*
	public static String obtenerParametro(List<Parametro> lstParametro, String llave) {
		if (lstParametro != null) {
			for (Parametro parametro : lstParametro) {
				if (parametro!=null && parametro.getLlave().equals(llave)) {
					return parametro.getValor();
				}
			}
		}
		return "";
	}
	
	public static List<String> obtenerParametrosTipo(List<Parametro> lstParametro, String tipo) {
		List<String> lstValores=new ArrayList<>();
		if (lstParametro != null) {
			for (Parametro parametro : lstParametro) {
				if (parametro!=null && parametro.getTipo().equals(tipo)) {
					lstValores.add(parametro.getValor());
				}
			}
		}
		return lstValores;
	}

	public static List<Parametro> listarParametrosTipo(List<Parametro> listParametro, String tipo){
        List<Parametro> lstNewParametro = listParametro.stream()
                .filter(p -> p.getTipo().equals(tipo))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        return lstNewParametro;
    }
    */

	public static String generarRutaBase(String rutaImagen, String codigoEmpresa, String codigoProyecto, String codigoTipoDocumento, Date fechaProcesoLote) {
		String rutaBase = "";
		rutaBase = rutaImagen.concat(File.separator)
				.concat(codigoEmpresa).concat(File.separator)
				.concat(codigoProyecto.concat(File.separator)
						.concat(codigoTipoDocumento).concat(File.separator)
						.concat(FechaUtil.convertirString(fechaProcesoLote, "ddMMyyyy")));
		return rutaBase;
	}

	public static int diasTranscurridos(int dia, int mes){
		int[] diasDeMeses = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };
		int sumaDeDias = 0;
		for (int i = 0; i < mes - 1; i++) {
			sumaDeDias += diasDeMeses[i];
		}
		sumaDeDias += dia;
		return sumaDeDias;
	}
	
    public static boolean existeCalibInicio(File rutaArchivoCalib, String fileName) {
        boolean existe = false;
        File[] listOfFiles = rutaArchivoCalib.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                if (listOfFiles[i].getName().equals(fileName)) {
                    existe = true;
                }
            } else {
                existe = false;
            }
        }
        return existe;
    }
    
    private static Map sort(Map unsortMap, int order) {
        List list = new LinkedList(unsortMap.entrySet());

        if (order == 1) {
            // Para ordenar ascendentemente
        	Comparator comparatorAscendente = (Object o1, Object o2) -> ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            Collections.sort(list, comparatorAscendente);
        } else {
            // Para ordenar descendentemente
        	Comparator comparatorDescendente = (Object o1, Object o2) -> ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
            Collections.sort(list, comparatorDescendente);
            
            
        }

        // put sorted list into map again
        Map<String, String> sortedMap = new LinkedHashMap();

        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static Date modificarFechaFile(String rutaFile) throws ParseException {

        File file = new File(rutaFile);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ssZ");

        String pattern = "dd/MM/yyyy HH:mm:ssZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        // set this date
        String newLastModifiedString = date;
        // we have to convert the above date to milliseconds...
        Date newLastModifiedDate = dateFormat.parse(newLastModifiedString);
        file.setLastModified(newLastModifiedDate.getTime());

        return newLastModifiedDate;

    }
    
    public static boolean copiarFromTo(String fileDesde, String fileHacia) throws GmdException, NoSuchFileException {
        boolean exito = false;
        try {
            Files.copy(Paths.get(fileDesde), Paths.get(fileHacia), StandardCopyOption.REPLACE_EXISTING);
            exito = true;
        } catch (NoSuchFileException e){
            throw new NoSuchFileException(fileDesde);
        } catch (IOException e) {
            throw new GmdException(e);
        }
        return exito;
    }

    public static boolean validarNivelContrasena(String contrasena) throws GmdException{
	    boolean exito = false;
        char clave;
        byte  contNumero = 0, contLetraMay = 0, contLetraMin=0, contEspeciales = 0;
        try {
            for (byte i = 0; i < contrasena.length(); i++) {
                clave = contrasena.charAt(i);
                String passValue = String.valueOf(clave);
                if (passValue.matches("[A-Z]")) {
                    contLetraMay++;
                } else if (passValue.matches("[a-z]")) {
                    contLetraMin++;
                } else if (passValue.matches("[0-9]")) {
                    contNumero++;
                } else if (passValue.matches("[@$!%*?&_+-]")){
                    contEspeciales++;
                }
            }
            if (contNumero >= 1 && contLetraMay >= 1 && contLetraMin >= 1 && contEspeciales >= 1) {
                exito = true;
            }
        } catch (Exception e){
            throw new GmdException(e);
        }
        return exito;
    }

    public static int contarHojasDocumento(String rutaDocumento, String tipoImagen) throws IOException {
        if (tipoImagen.equalsIgnoreCase(ConstantesCore.EXTENSION_DOCUMENTO_PDF)){
            PdfReader document = new PdfReader(new FileInputStream(new File(rutaDocumento)));
            return document.getNumberOfPages();
        } else if (tipoImagen.equalsIgnoreCase(ConstantesCore.EXTENSION_DOCUMENTO_TIF)){
            File file = new File(rutaDocumento);
            SeekableStream seekableStream = new FileSeekableStream(file);
            ImageDecoder decoder = ImageCodec.createImageDecoder("tiff", seekableStream, null);
            return decoder.getNumPages();
        }
        return 0;
    }

    public static Date obtenerFechaModif(String rutaArchivo) throws ParseException{

        File file = new File(rutaArchivo);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ssZ");

        String newLastModifiedDate = dateFormat.format(file.lastModified());
        Date newLastDateModif = dateFormat.parse(newLastModifiedDate);

        return newLastDateModif;

    }
}
