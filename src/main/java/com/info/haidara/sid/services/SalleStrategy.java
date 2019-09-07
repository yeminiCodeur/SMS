package com.info.haidara.sid.services;

import java.util.List;

import com.info.haidara.sid.entities.Salle;

public interface SalleStrategy {
  public List<Salle> findAll();
  public Salle findByNumSalle(String numSalle);
}
