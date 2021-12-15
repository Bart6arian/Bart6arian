package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface EmplyeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> showEmployeeLastname(@Param("LASTNAME") String lastname);

    @Query("SELECT e FROM Emplyee e WHERE e.name LIKE CONCAT('%', :NAME, '%')")
    Optional<List<Employee>> searchEmployeeByChars(@Param("NAME") String name);

}
