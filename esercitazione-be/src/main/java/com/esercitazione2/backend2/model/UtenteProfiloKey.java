package com.esercitazione2.backend2.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UtenteProfiloKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "codice_utente")
	String codiceUtente;
	
	@Column(name = "codice_profilo")
	String codiceProfilo;

	public String getIdUtente() {
		return codiceUtente;
	}

	public void setIdUtente(String codiceUtente) {
		this.codiceUtente = codiceUtente;
	}

	public String getIdProfilo() {
		return codiceProfilo;
	}

	public void setIdProfilo(String idProfilo) {
		this.codiceProfilo = idProfilo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codiceProfilo, codiceUtente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UtenteProfiloKey other = (UtenteProfiloKey) obj;
		return Objects.equals(codiceProfilo, other.codiceProfilo) && Objects.equals(codiceUtente, other.codiceUtente);
	}

	

	
}
