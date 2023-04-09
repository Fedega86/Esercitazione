package com.esercitazione2.backend2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercitazione2.backend2.model.Profilo;
import com.esercitazione2.backend2.repository.ProfiloRepository;

@Service
public class ProfiloServiceImpl implements ProfiloService {

	@Autowired
	ProfiloRepository profiloRepository;
	
	@Override
	public List<Profilo> read() {
		return profiloRepository.findAll();
	}

}
