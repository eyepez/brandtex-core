package com.brandtex.core.service.impl;

import com.brandtex.core.dao.UsuariosDao;
import com.brandtex.core.domain.Usuarios;
import com.brandtex.core.exception.BrandtexException;
import com.brandtex.core.service.UsuariosService;
import com.brandtex.core.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UsuariosServiceImpl extends BaseServiceImpl<Usuarios, Object> implements UsuariosService {

    @Autowired
    private UsuariosDao usuariosDao;

    @PostConstruct
    public void init() {
        super.setBase(usuariosDao);
    }

    @Override
    public int obtenerSeqUsuario() throws BrandtexException {
        return usuariosDao.obtenerSeqUsuario();
    }
}
