package com.workintech.developers;

import java.sql.SQLOutput;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getId() + "senior developer starts to work");
    }
}
