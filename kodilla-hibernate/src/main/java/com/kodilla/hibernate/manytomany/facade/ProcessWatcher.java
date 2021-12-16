package com.kodilla.hibernate.manytomany.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class ProcessWatcher {

    private static final Logger logger = LoggerFactory.getLogger(ProcessWatcher.class);

    @Before("execution(* com.kodilla.hibernate.manytomany.facade.SearchFacade.findCompany(..))" +
            "&& args(companyName)&&target(object)")
    public void loggOutInfoCompany(String companyName, Object object) {
        logger.info("Object: " + object + ", Args: " + companyName);
    }

    @Before("execution(* com.kodilla.hibernate.manytomany.facade.SearchFacade.findEmployee(..))" +
            "&& args(employee)&&target(object)")
    public void loggOutInfo(String employee, Object object) {
        logger.info("Object: " + object + ", Args: " + employee);
    }
}
