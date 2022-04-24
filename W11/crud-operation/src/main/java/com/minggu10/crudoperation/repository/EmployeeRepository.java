package com.minggu10.crudoperation.repository;

/**
 *
 * @author FAKHRI
 */
import com.minggu10.crudoperation.model.Employee;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends PersonRepository <Employee>
{
    
}