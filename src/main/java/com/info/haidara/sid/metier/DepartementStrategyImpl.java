package com.info.haidara.sid.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.haidara.sid.dao.DepartementRepository;
import com.info.haidara.sid.entities.Departement;
import com.info.haidara.sid.services.DepartementStrategy;

@Service
@Transactional
public class DepartementStrategyImpl  implements DepartementStrategy{

	@Autowired
	DepartementRepository drepository;
	@Override
	public List<Departement> listeDepartements() {
		List<Departement> dpts = drepository.findAll();
		if(dpts.isEmpty()) throw new RuntimeException("Aucune donnees");
		return dpts;
	}
	@Override
	public Departement find(long slug) {
		// TODO Auto-generated method stub
		return drepository.findById(slug).get();
	}

}
