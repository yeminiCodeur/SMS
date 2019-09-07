package com.info.haidara.sid.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.haidara.sid.dao.TypeSalleRepository;
import com.info.haidara.sid.entities.TypeSalle;
import com.info.haidara.sid.services.TypeSalleStrategy;


@Service
public class TypeSalleStrategyImpl implements TypeSalleStrategy{
	@Autowired TypeSalleRepository tsr;

	@Override
	public List<TypeSalle> findAll() {
		// TODO Auto-generated method stub
		return tsr.findAll();
	};
}
