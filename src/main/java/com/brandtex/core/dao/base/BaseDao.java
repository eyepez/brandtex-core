package com.brandtex.core.dao.base;

import pe.com.gmd.bpo.util.exception.GmdException;

import java.util.List;


public interface BaseDao<E, T> {
	
	void insert(E entity) throws GmdException;

	List<E> retrieve(T filtros) throws GmdException;

	void update(E entity) throws GmdException;

	void delete(T id) throws GmdException;

	E get(T id) throws GmdException;

}
