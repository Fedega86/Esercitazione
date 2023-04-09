package com.esercitazione2.backend2.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class UtenteProfilo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@EmbeddedId
	private UtenteProfiloKey key = new UtenteProfiloKey();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("codiceUtente")
	@JoinColumn(name = "codice_utente")
	Utente utente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("codiceProfilo")
	@JoinColumn(name = "codice_profilo")
	Profilo profilo;

	public UtenteProfiloKey getKey() {
		return key;
	}
	public void setKey(UtenteProfiloKey key) {
		this.key = key;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Profilo getProfilo() {
		return profilo;
	}
	public void setProfilo(Profilo profilo) {
		this.profilo = profilo;
	}
	
	
	
	
}
