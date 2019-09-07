package com.info.haidara.sid.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.haidara.sid.entities.Formation;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation, Long>{
	 @Query("SELECT f FROM Formation f WHERE f.code=:code or f.nom=:code")
	 public Formation findbyCodeOrNom(@Param("code")String code);
}
