package com.csmtech.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Library;
@Repository
public interface LibraryRepository extends CrudRepository<Library, Integer> {

	//Optional<Library> findById(Library library);



}
