package com.company.inherited;

import java.util.List;

public class Engineer extends Employment {

    public Engineer(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public void work() {
        System.out.println("Engineer works...");
    }
}
