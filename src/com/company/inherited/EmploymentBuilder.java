package com.company.inherited;

public interface EmploymentBuilder<T extends Employment> {

    EmploymentBuilder<T> name(String name);

    EmploymentBuilder<T> salary(double salary);

    EmploymentBuilder<T> duty(String duty);

    T build();
}
