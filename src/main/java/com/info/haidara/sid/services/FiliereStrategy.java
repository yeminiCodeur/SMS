package com.info.haidara.sid.services;

import java.util.List;

import com.info.haidara.sid.entities.Filiere;

public interface FiliereStrategy {
 
	public void addNewFiliiere(Filiere filiere);
	public List<Filiere> listeFilieres();
}
