package com.brandtex.core.service.base;

import com.brandtex.core.dao.base.BaseDao;
import com.brandtex.core.exception.BrandtexException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BaseServiceImpl<E, T> implements BaseService<E, T> {

	private BaseDao<E, T> baseDao;

	@Transactional
	public void insertar(E entidad) throws BrandtexException {
		try {
			baseDao.insert(entidad);
		} catch (Exception e) {
			throw new BrandtexException(e);
		}
		
	}
	
	public List<E> listar(T filtros) throws BrandtexException {
		try {
			return baseDao.retrieve(filtros);
		} catch (Exception e) {
			throw new BrandtexException(e);
		}
	}

	@Transactional
	public void actualizar(E entidad) throws BrandtexException {
		try {
			baseDao.update(entidad);
		} catch (Exception e) {
			throw new BrandtexException(e);
		}
	}

	@Transactional
	public void eliminar(T id) throws BrandtexException {
		try {
			baseDao.delete(id);
		} catch (Exception e) {
			throw new BrandtexException(e);
		}
	}

	public E obtener(T id) throws BrandtexException {
		try {
			return baseDao.get(id);
		} catch (Exception e) {
			throw new BrandtexException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public void setBase(BaseDao<?, ?> baseDao) {
		this.baseDao = (BaseDao<E, T>) baseDao;
	}

}
