package com.company.inherited;

import java.util.List;

public class Teacher extends Employment {

    public Teacher(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public void work() {
        System.out.println("Teacher works...");
    }

}
