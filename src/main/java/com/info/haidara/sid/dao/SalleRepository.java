package com.info.haidara.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.haidara.sid.entities.Salle;

@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle, Long> {

	Salle findByNumeroSalle(String numeroSalle);

}
