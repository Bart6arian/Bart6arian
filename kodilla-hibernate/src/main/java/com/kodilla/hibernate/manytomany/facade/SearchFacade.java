package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmplyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchFacade {

    private CompanyDao company;
    private EmplyeeDao emplyee;

    @Autowired
    public SearchFacade(CompanyDao company, EmplyeeDao emplyee) {
        this.company = company;
        this.emplyee = emplyee;
    }


    public Company findCompany(String companyName) {
        return company.searchCompanyByChars(companyName).orElseThrow().get(0);
    }

    public Employee findEmployee(String employeeName) {
        return emplyee.searchEmployeeByChars(employeeName).orElseThrow().get(0);
    }
}
