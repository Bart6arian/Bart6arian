package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldsystem.SalaryCalc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalc {

    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();
        for(int x = 0; x < salaries.length; x++) {
            employeeList.add(new Employee(
                    workers[x][0],
                    workers[x][1],
                    workers[x][2],
                    new BigDecimal(salaries[x])));
        }
        return calculateSalaries(employeeList).doubleValue();
    }
}
