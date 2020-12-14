package com.tactfactory.microservice.monprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tactfactory.microservice.monprojet.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
