package com.devsuperiorcap1.bootcampex01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperiorcap1.bootcampex01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
