package com.sample;

public class DescriptionExcellenceAcademique extends Description {

	public DescriptionExcellenceAcademique(String nom,int moyenneaubacdesintegres, boolean knownprofessor, int  nbreelevesparenseignant,float poucentageenseignantshdr,int nbrepublicationsparan,String typeecole ) {
		
		super(nom);
		this.moyenneaubacdesintegres = moyenneaubacdesintegres;
		this.knownprofessor = knownprofessor;
		this.nbreelevesparenseignant = nbreelevesparenseignant;
		this.poucentageenseignantshdr=poucentageenseignantshdr;
		this.nbrepublicationsparan = nbrepublicationsparan;
		this.typeecole=typeecole;
		
	}
	public int moyenneaubacdesintegres ;
	public boolean knownprofessor;

	public int nbreelevesparenseignant ;
	
	public float poucentageenseignantshdr;
	
	public int nbrepublicationsparan;
	
	public String typeecole;
	
	public String getTypeecole() {
		return typeecole;
	}

	public void setTypeecole(String typeecole) {
		this.typeecole = typeecole;
	}

	public int getNbrepublicationsparan() {
		return nbrepublicationsparan;
	}

	public void setNbrepublicationsparan(int nbrepublicationsparan) {
		this.nbrepublicationsparan = nbrepublicationsparan;
	}
	

	public int getMoyenneaubacdesintegres() {
		return moyenneaubacdesintegres;
	}

	public void setMoyenneaubacdesintegres(int moyenneaubacdesintegres) {
		this.moyenneaubacdesintegres = moyenneaubacdesintegres;
	}

	public boolean isKnownprofessor() {
		return knownprofessor;
	}

	public void setKnownprofessor(boolean knownprofessor) {
		this.knownprofessor = knownprofessor;
	}

	public int getNbreelevesparenseignant() {
		return nbreelevesparenseignant;
	}

	public void setNbreelevesparenseignant(int nbreelevesparenseignant) {
		this.nbreelevesparenseignant = nbreelevesparenseignant;
	}

	public float getPoucentageenseignantshdr() {
		return poucentageenseignantshdr;
	}

	public void setPoucentageenseignantshdr(float poucentageenseignantshdr) {
		this.poucentageenseignantshdr = poucentageenseignantshdr;
	}
	@Override
	public String toString() {
		return "DescriptionExcellenceAcademique [moyenneaubacdesintegres=" + moyenneaubacdesintegres + ", knownprofessor=" + knownprofessor + ",nbreelevesparenseignant ="
				+ nbreelevesparenseignant + ", poucentageenseignantshdr=" + poucentageenseignantshdr+", typeecole=" + typeecole+ ", nbrepublicationsparan=" + nbrepublicationsparan+", nomEcole=" + nomEcole + "]";
	}
}
	