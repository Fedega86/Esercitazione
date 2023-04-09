package com.esercitazione2.backend2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercitazione2.backend2.model.UtenteProfilo;
import com.esercitazione2.backend2.service.UtenteProfiloService;

@CrossOrigin
@RestController
@RequestMapping(value="/utente_profilo")
public class UtenteProfiloController {

	
	@Autowired
	UtenteProfiloService utenteProfiloService;
	
	
	@GetMapping
	public List<UtenteProfilo> readUtenteProfilo() {
		return utenteProfiloService.read();
	}
	
	
}
