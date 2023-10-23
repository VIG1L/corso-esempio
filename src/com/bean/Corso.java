package com.bean;

public class Corso {

	private String codice, titolo, sede;

	public String getCodice() {
		
		return codice;
		
	}

	public void setCodice(String codice) {
		
		this.codice = codice;
		
	}

	public String getTitolo() {
		
		return titolo;
		
	}

	public void setTitolo(String titolo) {
		
		this.titolo = titolo;
		
	}

	public String getSede() {
		
		return sede;
		
	}

	public void setSede(String sede) {
		
		this.sede = sede;
		
	}

	protected Corso (){
		
		
		
	}

	public Corso(String codice, String titolo, String sede) {
		//super();
		this.codice = codice;
		this.titolo = titolo;
		this.sede = sede;
	}

	
	public String toString() {
		return "Corso [codice=" + codice + ", titolo=" + titolo + ", sede=" + sede + ", getCodice()=" + getCodice()
				+ ", getTitolo()=" + getTitolo() + ", getSede()=" + getSede() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
