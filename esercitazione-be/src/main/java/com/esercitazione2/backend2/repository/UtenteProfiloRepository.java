package com.esercitazione2.backend2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esercitazione2.backend2.model.UtenteProfilo;
import com.esercitazione2.backend2.model.UtenteProfiloKey;

@Repository
public interface UtenteProfiloRepository extends JpaRepository<UtenteProfilo, UtenteProfiloKey>{
	
}
