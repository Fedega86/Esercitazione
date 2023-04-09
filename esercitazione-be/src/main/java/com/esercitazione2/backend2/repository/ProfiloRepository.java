package com.esercitazione2.backend2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esercitazione2.backend2.model.Profilo;

@Repository
public interface ProfiloRepository extends JpaRepository<Profilo, String> {

}
