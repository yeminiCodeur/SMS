package com.info.haidara.sid.services;

import java.util.List;

import com.info.haidara.sid.entities.Departement;

public interface  DepartementStrategy  {
public List<Departement> listeDepartements();

   public Departement find(long slug);
}
