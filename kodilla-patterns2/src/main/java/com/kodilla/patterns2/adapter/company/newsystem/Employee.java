package com.kodilla.patterns2.adapter.company.newsystem;

import java.math.BigDecimal;

public class Employee {
    final private String id;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String id, String firstname, String lastname, BigDecimal baseSalary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null) return false;
        if (getFirstname() != null ? !getFirstname().equals(employee.getFirstname()) : employee.getFirstname() != null)
            return false;
        if (getLastname() != null ? !getLastname().equals(employee.getLastname()) : employee.getLastname() != null)
            return false;
        return getBaseSalary() != null ? getBaseSalary().equals(employee.getBaseSalary()) : employee.getBaseSalary() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
