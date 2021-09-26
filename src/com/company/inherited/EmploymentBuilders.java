package com.company.inherited;

import java.util.ArrayList;
import java.util.List;

public class EmploymentBuilders {

    /**
     * Static factory methods
     */
    public static EmploymentBuilder<Engineer> newEngineer() {
        return new EngineerBuilder();
    }

    public static EmploymentBuilder<Teacher> newTeacher() {
        return new TeacherBuilder();
    }

    /**
     * Pilot Teacher
     */
    static class TeacherBuilder extends AbstractEmploymentBuilder<Teacher> {

        @Override
        protected Teacher internalBuild() {
            return new Teacher(this.name, this.salary, this.duties);
        }
    }

    /**
     * Engineer Builder
     */
    static class EngineerBuilder extends AbstractEmploymentBuilder<Engineer> {

        @Override
        protected Engineer internalBuild() {
            return new Engineer(this.name, this.salary, this.duties);
        }
    }

    abstract static class AbstractEmploymentBuilder<T extends Employment> implements EmploymentBuilder<T> {

        String name;

        double salary;

        List<String> duties = new ArrayList<>();

        @Override
        public EmploymentBuilder<T> name(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            this.name = name;
            return this;
        }

        @Override
        public EmploymentBuilder<T> salary(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be smaller than 0");
            }

            this.salary = salary;
            return this;
        }

        @Override
        public EmploymentBuilder<T> duty(String duty) {
            if (duty == null || duty.isEmpty()) {
                throw new IllegalArgumentException("Duty cannot be empty");
            }

            duties.add(duty);
            return this;
        }

        public T build() {
            return internalBuild();
        }

        protected abstract T internalBuild();
    }
}
