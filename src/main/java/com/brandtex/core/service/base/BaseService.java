package com.brandtex.core.service.base;

import com.brandtex.core.dao.base.BaseDao;
import com.brandtex.core.exception.BrandtexException;

import java.util.List;

public interface BaseService<E, T>{

	void insertar(E entidad) throws BrandtexException;

	List<E> listar(T filtros) throws BrandtexException;

	void actualizar(E entidad) throws BrandtexException;

	void eliminar(T id) throws BrandtexException;

	E obtener(T id) throws BrandtexException;

	void setBase(BaseDao<?, ?> baseDao);
}
