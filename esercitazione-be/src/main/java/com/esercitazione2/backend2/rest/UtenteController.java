package com.esercitazione2.backend2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercitazione2.backend2.model.Utente;
import com.esercitazione2.backend2.service.UtenteService;

@CrossOrigin
@RestController
@RequestMapping(value="/utente")
public class UtenteController {

	@Autowired
	UtenteService utenteService;
	
	
	@GetMapping
	public List<Utente> getUtente() {
		return utenteService.read();
	}
	
}
