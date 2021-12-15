package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> showFirstThreeChars(@Param("NAME") String name);

    @Query("SELECT c FROM Company c WHERE c.name LIKE CONCAT('%', :NAME, '%')")
    Optional<List<Company>> searchCompanyByChars(@Param("NAME") String name);
}
