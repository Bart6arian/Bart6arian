package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newsystem.Employee;
import com.kodilla.patterns2.adapter.company.newsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor processor = new CompanySalaryProcessor();
        return processor.calculateSalaries(employees);
    }
}
