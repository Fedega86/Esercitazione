package com.esercitazione2.backend2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercitazione2.backend2.model.Profilo;
import com.esercitazione2.backend2.service.ProfiloService;

@CrossOrigin
@RestController
@RequestMapping(value="/profilo")
public class ProfiloController {
	
	@Autowired
	ProfiloService profiloService;

	@GetMapping
	public List<Profilo> readProfilo() {
		return profiloService.read();
	}
	
}
