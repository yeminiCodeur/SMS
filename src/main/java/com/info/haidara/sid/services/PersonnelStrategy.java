package com.info.haidara.sid.services;

import com.info.haidara.sid.entities.Person;

public interface PersonnelStrategy {
  public Person find(long id);
  public Person findByCode(String slug);
}
