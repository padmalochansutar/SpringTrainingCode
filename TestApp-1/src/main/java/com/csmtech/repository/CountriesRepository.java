package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Countries;


@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

}
