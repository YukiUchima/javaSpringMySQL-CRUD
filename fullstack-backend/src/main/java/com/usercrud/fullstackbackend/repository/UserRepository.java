package com.usercrud.fullstackbackend.repository;

import com.usercrud.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

}
