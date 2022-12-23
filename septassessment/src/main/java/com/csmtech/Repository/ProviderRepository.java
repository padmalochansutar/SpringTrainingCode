package com.csmtech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.Model.Provider;
@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
