package com.bond.сrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bond.сrud.entities.ProviderCrud;

@Repository
public interface ProvidersRepository extends CrudRepository<ProviderCrud, String> {

}
