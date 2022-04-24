package com.minggu10.crudoperation.service;

/**
 *
 * @author FAKHRI
 */

import java.util.List;
import com.minggu10.crudoperation.model.Person;
public interface GenericService<T extends Person> {
    List<T> findAll() throws Exception;
	T save(T entity) throws Exception;
	void delete(Long id) throws Exception;
}