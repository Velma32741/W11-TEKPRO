package com.minggu10.crudoperation.model;

/**
 *
 * @author FAKHRI
 */

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Table;
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "Employee")
public class Employee extends Person{
    @Column  
    private String name;
    @Column
    private int salary;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getsalary() {
        return this.salary;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

}