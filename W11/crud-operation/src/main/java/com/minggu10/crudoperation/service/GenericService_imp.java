package com.minggu10.crudoperation.service;

/**
 *
 * @author FAKHRI
 */

import java.util.List;
import com.minggu10.crudoperation.repository.PersonRepository;
import com.minggu10.crudoperation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;  

public class GenericService_imp<T extends Person> implements GenericService<T>{
    @Autowired
    protected PersonRepository<T> genericRepository;
    @Override
    public List<T> findAll() throws Exception {
        try {
            return (List<T>) genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public void delete(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}