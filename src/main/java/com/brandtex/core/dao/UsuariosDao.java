package com.brandtex.core.dao;

import com.brandtex.core.dao.base.BaseDao;
import com.brandtex.core.domain.Usuarios;
import com.brandtex.core.exception.BrandtexException;

public interface UsuariosDao extends BaseDao<Usuarios, Object> {

	int obtenerSeqUsuario() throws BrandtexException;

}