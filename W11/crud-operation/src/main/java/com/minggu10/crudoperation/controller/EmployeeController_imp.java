package com.minggu10.crudoperation.controller;

/**
 *
 * @author FAKHRI
 */

import com.minggu10.crudoperation.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")

public class EmployeeController_imp extends PersonController_imp<Employee> implements EmployeeController {
    
}