package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Document;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
