package com.info.haidara.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.haidara.sid.entities.Groupe;
@RepositoryRestResource
public interface GroupeRepository extends JpaRepository<Groupe, Long>{

}
