//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut

import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private String name;
    private String lastName;
    private String surename;
    private int department;
    private int salary;
    private int id;

    public Employee(String name, String lastName, String surename, int department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.surename = surename;
        this.department = department;
        this.salary = salary;

        counter++;
        id = counter;
    }

    public String getName() {

        return this.name;
    }

    public String getLastName() {

        return this.lastName;
    }

    public String getsurename() {

        return this.surename;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {

        return this.department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "name= " + name + '\'' + "lastName= " + lastName + '\'' + "surename= " + surename + '\'' + "department= " + department + '\'' + "salary= " + salary + '\'' + "id= " + id + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee otherEmployee = (Employee) o;
        return this.id == otherEmployee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, surename, department, salary, id);
    }
}

