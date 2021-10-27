package pe.com.gmd.gsdimage.core.util;

public class ConstantesCore {

    private ConstantesCore() {
    }

    /*CONSTANTES DE INICIO DE SESION*/
    public static final String WS_USUARIO_ACCESO_EXITO = "01";
    public static final String WS_USUARIO_ACCESO_NO_EXISTE = "02";
    public static final String WS_USUARIO_ACCESO_INCORRECTO = "03";
    public static final String WS_USUARIO_ACCESO_BLOQUEADO = "04";
    public static final String WS_USUARIO_ACCESO_INACTIVO = "05";
    public static final String WS_USUARIO_ACCESO_FINALIZADO = "06";

    /* Nombre de atributos del Map */
    public static final String MODULOS = "modulos";
    public static final String EMPRESAS = "empresas";
    public static final String PROYECTOS = "proyectos";
    public static final String PROCESOS = "procesos";
    public static final String USUARIO = "usuario";
    public static final String PERFILES = "perfiles";
    public static final String DOCUMENTAL = "documentales";
    public static final String PARAMGESTION = "paramgestion";
    public static final String PARAMETROS = "parametros";
    public static final String CONFIGURACIONES = "configuraciones";
    public static final String ESTADOS = "estados";
    public static final String CAMPOS_DOCUMENTO = "camposDocumentos";
    public static final String CAMPOS_DETALLE = "camposDetalles";
    public static final String INCIDENCIAS = "incidencias";
    public static final String PERFIL = "perfil";
    public static final String WORKFLOW = "workflow";
    public static final String OK = "ok";
    public static final String CODIGO_CORRECTO = "0";
    public static final String CODIGO_INCORRECTO = "1";
    public static final String CODIGO_ESTADO_CONFIGURADO = "1";
    public static final String CODIGO_ESTADO_NO_CONFIGURADO = "0";
    public static final String SEQ_PARAMETRO = "6";
    public static final String SEQ_PARAMETRO_DETALLE = "12";

    public static final String PARAM_TIPO_ESTADOLOTE = "PERFILES";
    public static final String PARAM_TIPO_PERFILES = "ESTADOS_LOTE";
    public static final String PARAM_USO_DESKTOP = "D";
    public static final String PARAM_USO_WEB = "W";
    public static final String PARAM_USO_GENERAL = "G";

    public static final String PARAM_IDSISTEMA_SAA = "saa.sistema.id";

    /* Nombre de carpetas para Digitalizacion */
    public static final String NOMBRE_CARPETA_CALIBRACION = "CALIB";

    public static final String IND_PROC_LOTE_EN_PROCESO = "1";
    public static final String IND_TIPO_CAPTURA_AUTOMATIZADO = "0";

    public static final String NUM_DIGITOS_LOTE_PRODUCCION = "4";
    public static final String FILE_EXTENSION_BACKUP = ".bck";
    public static final String FILE_EXTENSION_TIF = ".tif";
    public static final String EXTENSION_DOCUMENTO_PDF = "PDF";
    public static final String EXTENSION_DOCUMENTO_TIF = "TIF";

    public static final String NUM_DIGITOS_SECUENCIAL = "5";
    public static final String NUM_DIGITOS_SEC_FECHA = "3";

    public static final String RENOMBRE_CALIB_INI = "clb_ini_";
    public static final String RENOMBRE_CALIB_FIN = "clb_fin_";

    public static final String CODIGO_ESTADO_LOTE_CAPTURADO = "007";
    public static final String CODIGO_INDICADOR_LOTE_PROCESADO = "2";

    public static final String ESTADO_DIGITALIZADO = "modigi.estado.digitalizado";
    public static final String IND_DOCU_NO_PROCESADO = "0";

    public static final int CANT_MAX_LOTES_A_PROCESAR = 10;

    public static final int INDEX_CABECERA_LOTES = 0;
    public static final int INDEX_CABECERA_SUBLOTES = 1;

    public static final String FORMATO_FECHA_JSON = "yyyy-MM-dd HH:mm:ss";//.SS
    public static final String CLAVE_RECEPCION = "recepcion";
    public static final String CLAVE_MOVIL_LOTE = "movilote";
    public static final String CLAVE_REPLICACION = "replicacion";
    public static final String REPLICACION_PROCESADO = "PROCESADO";
    public static final String REPLICACION_ERROR = "ERROR";
    public static final String REPLICACION_PROCESANDO = "PROCESANDO";
    public static final String REPLICACION_RECIBIDO = "RECIBIDO";
    public static final String REPLICACION_ACTUALIZADO = "ACTUALIZADO";

    /*VARIABLES DE ESTADOS COMÚNES*/
    public static final String ESTADO_DEFECTO = "00";
    public static final String ESTADO_ACTIVO = "01";
    public static final String ESTADO_INACTIVO = "02";

    /*VARIABLES DE ESTADO SEGURIDAD SAA*/
    public static final String ESTADO_ACTIVO_SAA = "A";
    public static final String ESTADO_INACTIVO_SAA = "I";
    public static final String ESTADO_BLOQUEDO_SAA = "B";

    public static final String IND_REQ_CAMBIO_CLAVE_SI = "0";
    public static final String IND_REQ_CAMBIO_CLAVE_NO = "1";

    /*VARIALES DE ESTADOS DE INCIDENCIAS*/
    public static final String ESTADO_INC_INACTIVA = "00";
    public static final String ESTADO_INC_ACTIVA = "01";
    public static final String ESTADO_INC_CORREGIDA = "02";
    public static final String ESTADO_MUESTRA = "03";

    /*VARIABLES PARAMETRO*/
    public static final String PARAM_MEDIOS_TIPO_MED = "TIPO_MEDIO";
    public static final String PARAM_MEDIOS_TIPO_BUSQ = "TIPO_BUSQUEDA";

    //GRUPO CATEGORIA INCIDENCIA
    public static final String GRP_CATEG_INCIDENCIA = "CATEG_INCIDENCIA";

    //GRUPO ESTADO CATEGORIA INCIDENCIA
    public static final String GRP_ESTADO_CATEG_INCI = "ESTADO_CATEG_INCI";

    //CODIGOS DE TIPO PROYECTO
    public static final String PROYECTO_SIN_VALOR_LEGAL = "0";
    public static final String PROYECTO_CON_VALOR_LEGAL = "1";

    //CODIGOS DE TIPO OCR
    public static final String PROYECTO_SIN_OCR = "01";
    public static final String PROYECTO_CON_OCR = "02";

    //ESTADOS DE AGRUPAMIENTO
    public static final String COD_ESTADO_SIN_AGRUPAR = "00";
    public static final String COD_ESTADO_AGRUPADO = "01";
    public static final String COD_ESTADO_REAGRUPADO = "02";

    //ESTADOS DE OPERACION ACTIVIDAD
    public static final int COD_ESTADO_ACTIVO = 1;
    public static final int COD_ESTADO_INACTIVO = 0;

    //GRUPO ESTADO CALIBRADORA INICIAL
    public static final String GRP_ESTADO_CALIB_INI = "ESTADO_CALIB_INI";

    //GRUPO DE LLAVES PRINCIPALES
    public static final String LLAVE_EMPRESA = "codigoEmpresa";
    public static final String LLAVE_PROYECTO = "codigoProyecto";
    public static final String LLAVE_TIPODOCU = "codigoTipoDocumento";
    public static final String LLAVE_CODLOTEPROD = "codigoLoteProd";

    //ESTADOS DE ACTUALIZACION DE PESO
    public static final String COD_ESTADO_FIRMADO = "03";
    public static final String COD_ESTADO_FIRMADO_OBSERVADO = "04";

    //ESTADOS DE ACTUALIZACION CAMPO OCR
    public static final String COD_ESTADO_OCR = "05";
    public static final String COD_ESTADO_OCR_OBS = "06";

    //LLAVES DE MAPAS
    public static final String LLAVE_MAPA_COD_EMPRESA = "codigoEmpresa";
    public static final String LLAVE_MAPA_COD_NUMSUBLOTE = "numerosubLote";
    public static final String LLAVE_MAPA_COD_PROYECTO = "codigoProyecto";
    public static final String LLAVE_MAPA_COD_TIPODOCU = "codigoTipoDocumento";
    public static final String LLAVE_MAPA_COD_RECEPCION = "codigoRecepcion";
    public static final String LLAVE_MAPA_COD_RECEP = "codigoRece";
    public static final String LLAVE_MAPA_COD_ESTADOLOTE = "estadoLote";
    public static final String LLAVE_MAPA_LIST_COD_ESTADOLOTE = "lstEstadoLote";
    public static final String LLAVE_MAPA_NUM_LOTERECE = "numeroLoteRece";
    public static final String LLAVE_MAPA_COD_LOTEPROD = "codigoLoteProd";
    public static final String LLAVE_MAPA_COD_MODULO = "codigoModulo";
    public static final String LLAVE_MAPA_COD_GRUPO = "idMetaDocuGrupo";
    public static final String LLAVE_MAPA_DES_NOMBRE = "nombreImagen";
    public static final String LLAVE_MAPA_FEC_LOTEPROD = "fechaProcesoLote";
    public static final String LLAVE_MAPA_ID_IMAGEN = "idImagen";
    public static final String LLAVE_MAPA_TIPODIGITACION = "tipoDigitacion";
    public static final String LLAVE_MAPA_COD_ESTADO = "codigoEstado";
    public static final String LLAVE_MAPA_COD_TIPODINCIDENCIA = "codigoTipoIncidencia";
    public static final String LLAVE_MAPA_PROCESO = "proceso";
    public static final String LLAVE_MAPA_COD_MATCH = "codigoMatch";
    public static final String LLAVE_MAPA_ESTADO_INCIDENCIA = "estadoIncidencia";
    public static final String LLAVE_MAPA_LISTA_COD_ESTADOLOTE = "listaEstados";

    //INDICADORES
    public static final double IND_RECHAZO_INICIA = 0.1;
}
