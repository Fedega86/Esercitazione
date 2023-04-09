package com.esercitazione2.backend2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercitazione2.backend2.model.UtenteProfilo;
import com.esercitazione2.backend2.repository.UtenteProfiloRepository;

@Service
public class UtenteProfiloServiceImpl implements UtenteProfiloService {


	@Autowired
	UtenteProfiloRepository utenteProfiloRepository;
	

	@Override
	public List<UtenteProfilo> read() {
		return utenteProfiloRepository.findAll();
	}
	
}
