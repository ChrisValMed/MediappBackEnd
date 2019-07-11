package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Signos;
import com.mitocode.repo.ISignosRepo;
import com.mitocode.service.ISignosService;

@Service
public class SignosServiceImpl implements ISignosService{

	@Autowired
	private ISignosRepo repo;
	
	@Override
	public Signos registrar(Signos t) {		
		return repo.save(t);
	}

	@Override
	public Signos modificar(Signos t) {		
		return repo.save(t);
	}

	@Override
	public Signos leer(Integer id) {		
		return repo.findOne(id);
	}

	@Override
	public List<Signos> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

}
