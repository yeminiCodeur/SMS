package com.info.haidara.sid.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.haidara.sid.dao.FiliereRepository;
import com.info.haidara.sid.entities.Filiere;
import com.info.haidara.sid.services.FiliereStrategy;

@Service
public class FiliereStrategyImpl implements FiliereStrategy {
	@Autowired
	FiliereRepository frepository;

	@Override
	public void addNewFiliiere(Filiere filiere) {
		try
		{
			frepository.save(filiere);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("oo");
		}
	}

	@Override
	public List<Filiere> listeFilieres() {
		List<Filiere> lf =  frepository.findAll();
		if(lf.isEmpty()) throw new RuntimeException("Aucune Donnee trouvee :) ");
		return lf;
	}

}
