package com.brandtex.core.service;

import com.brandtex.core.domain.Usuarios;
import com.brandtex.core.exception.BrandtexException;
import com.brandtex.core.service.base.BaseService;

public interface UsuariosService extends BaseService<Usuarios, Object> {

	int obtenerSeqUsuario() throws BrandtexException;

}