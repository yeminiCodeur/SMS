package com.info.haidara.sid.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.haidara.sid.dao.SalleRepository;
import com.info.haidara.sid.entities.Salle;
import com.info.haidara.sid.services.SalleStrategy;

@Service
public class SalleStrategyImpl implements SalleStrategy {

	@Autowired
	SalleRepository sallereposi;
	@Override
	public List<Salle> findAll() {
		return sallereposi.findAll();
	}
	@Override
	public Salle findByNumSalle(String numeroSalle) {
		// TODO Auto-generated method stub
		return sallereposi.findByNumeroSalle(numeroSalle);
	}

}

