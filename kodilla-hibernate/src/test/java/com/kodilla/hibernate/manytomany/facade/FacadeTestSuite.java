package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmplyeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmplyeeDao emplyeeDao;

    @BeforeEach
    void createAndSaveData() {
        Company company = new Company("KORPO-POL");
        Employee employee = new Employee("John", "Smith");
        companyDao.save(company);
        emplyeeDao.save(employee);
    }

    @AfterEach
    void clearData() {
        emplyeeDao.deleteAll();
        companyDao.deleteAll();
    }

    @Test
    void findCompany() {
        //given
        //when
        Company result = searchFacade.findCompany("afd");
        //then
        assertEquals(companyDao, result);
    }

    @Test
    void findEmployee() {
        //given
        //when
        Employee result = searchFacade.findEmployee("asfd");
        //then
        assertEquals(companyDao, result);
    }
}
