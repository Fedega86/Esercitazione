package com.esercitazione2.backend2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esercitazione2.backend2.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {

}