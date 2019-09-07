package com.info.haidara.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.haidara.sid.entities.Semestre;

@RepositoryRestResource
public interface SemestreRepository  extends JpaRepository<Semestre, Long>{

}
