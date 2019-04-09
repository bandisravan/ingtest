package com.src.ingtradeapp.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Users;
@Component
public interface AddUserRepo extends CrudRepository<Users, Serializable>{
}
