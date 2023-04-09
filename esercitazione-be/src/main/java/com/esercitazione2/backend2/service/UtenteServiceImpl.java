package com.esercitazione2.backend2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercitazione2.backend2.model.Utente;
import com.esercitazione2.backend2.repository.UtenteRepository;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteRepository utenteRepository;
	
	@Override
	public List<Utente> read() {
		return utenteRepository.findAll();
	}

}
