package com.info.haidara.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.haidara.sid.entities.Composition;

@RepositoryRestResource
public interface CompositionRepository extends JpaRepository<Composition, Long> {

}
