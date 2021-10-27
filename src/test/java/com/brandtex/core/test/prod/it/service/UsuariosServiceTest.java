package com.brandtex.core.test.prod.it.service;

import com.brandtex.core.domain.Usuarios;
import com.brandtex.core.service.UsuariosService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/test-gsdimage-service.xml")
public class UsuariosServiceTest {

	private static final Logger LOGGER = Logger.getLogger(UsuariosServiceTest.class);

	@Autowired
	private UsuariosService usuariosService;

	@Test
	public void guardarDetalleLote() {
		try {
			System.out.println("inicio");
			Map<String, Object> map = new HashMap<>();
			List<Usuarios> listUsuarios = usuariosService.listar(map);
            System.out.println(listUsuarios.toString());
			System.out.println("fin: " + listUsuarios.size());
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

}
