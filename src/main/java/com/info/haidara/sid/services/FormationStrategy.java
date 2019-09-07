package com.info.haidara.sid.services;

import java.util.ArrayList;
import java.util.List;

import com.info.haidara.sid.entities.Formation;
import com.info.haidara.sid.entities.FormationInitiale;
import com.info.haidara.sid.entities.FourmationContinue;

public interface FormationStrategy {

	//  formation
	public List<Formation> getListFormation();
	public void addNewFormationInitiale(FormationInitiale formation);
	public ArrayList<FormationInitiale> getListFormationInitiale();
	
	public void addNewFormationContinue(FourmationContinue formation);
	public ArrayList<FourmationContinue> getListFormationContinue();
	
	public Formation getFormationBySlug(String slug);
	
	
}
