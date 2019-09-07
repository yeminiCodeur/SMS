package com.info.haidara.sid.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.haidara.sid.dao.PersonRepository;
import com.info.haidara.sid.entities.Person;
import com.info.haidara.sid.services.PersonnelStrategy;

@Service
public class PersonneleStrategyImpl implements PersonnelStrategy{
  @Autowired PersonRepository pRepository;
	@Override
	public Person find(long id) {
		// TODO Auto-generated method stub
		return pRepository.findById(id).get();
	}
	@Override
	public Person findByCode(String slug) {
		// TODO Auto-generated method stub
		return pRepository.findByCode(slug);
	}

}
