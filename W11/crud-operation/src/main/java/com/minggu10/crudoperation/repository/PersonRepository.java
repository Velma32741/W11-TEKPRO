package com.minggu10.crudoperation.repository;

/**
 *
 * @author FAKHRI
 */

import com.minggu10.crudoperation.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  
//repository that extends CrudRepository
@Repository  
public interface PersonRepository <T extends Person> extends CrudRepository<T, Long>
{  
}   