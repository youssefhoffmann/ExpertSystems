package com.sample;

public class Avis {
	public Avis(String ecole, String valeur) {
		super();
		this.ecole = ecole;
		this.valeur = valeur;
	}
	public String ecole;
	public String valeur;
	
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	@Override
	public String toString() {
		return "Avis [ecole=" + ecole + ", valeur=" + valeur + "]";
	}
}