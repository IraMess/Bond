package com.bond.сrud.repository;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import com.bond.сrud.entities.*;

@Repository
public interface ClientRepository extends CrudRepository<ClientCrud, String>{

}
