package com.info.haidara.sid.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.haidara.sid.dao.FormationRepository;
import com.info.haidara.sid.entities.Formation;
import com.info.haidara.sid.entities.FormationInitiale;
import com.info.haidara.sid.entities.FourmationContinue;
import com.info.haidara.sid.services.FormationStrategy;

@Service
public class FormationStrategyImpl implements FormationStrategy {
	@Autowired
	FormationRepository frepository;

	@Override
	public void addNewFormationInitiale(FormationInitiale formation) {
		try {

			frepository.save(formation);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("opps");
		}

	}

	@Override
	public ArrayList<FormationInitiale> getListFormationInitiale() {

		return null;
	}

	@Override
	public void addNewFormationContinue(FourmationContinue formation) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<FourmationContinue> getListFormationContinue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getListFormation() {
		// TODO Auto-generated method stub
		List<Formation> lf = frepository.findAll();
		if (lf.isEmpty()) {
			throw new RuntimeException("Aucun donnees trouvee :)");
		}
		return lf;
	}

	@Override
	public Formation getFormationBySlug(String slug) {	
		return  frepository.findbyCodeOrNom(slug);
	}
}
