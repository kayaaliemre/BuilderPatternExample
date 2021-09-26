package com.company;

import com.company.inherited.Engineer;
import com.company.inherited.Teacher;
import com.company.inherited.EmploymentBuilders;

public class InheritedExample {

    public static void main(String[] args) {
        Engineer engineer =
                EmploymentBuilders.newEngineer()
                                  .name("Engineer")
                                  .salary(100)
                                  .duty("Code")
                                  .build();
        System.out.println(engineer);

        Teacher teacher =
                EmploymentBuilders.newTeacher()
                                  .name("Teacher")
                                  .salary(200)
                                  .duty("Teach")
                                  .build();
        System.out.println(teacher);
    }
}
