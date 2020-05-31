package com.sample;

public class DescriptionProximiteDesEntreprises extends Description {

	public DescriptionProximiteDesEntreprises(String nom,int salairealasortie, String reseaualumni, int  nbreentreprisesauforum,int nbrealumniauconseildadministrationcac40 ) {
		
		super(nom);
		this.salairealasortie = salairealasortie;
		this.reseaualumni= reseaualumni;
		this.nbreentreprisesauforum = nbreentreprisesauforum;
		this.nbrealumniauconseildadministrationcac40=nbrealumniauconseildadministrationcac40;
		
		
	}
	public int salairealasortie ;
	
	public String reseaualumni;

	public int  nbreentreprisesauforum;
	
	public int nbrealumniauconseildadministrationcac40;

	public int getSalairealasortie() {
		return salairealasortie;
	}

	public void setSalairealasortie(int salairealasortie) {
		this.salairealasortie = salairealasortie;
	}

	public String getReseaualumni() {
		return reseaualumni;
	}

	public void setReseaualumni(String reseaualumni) {
		this.reseaualumni = reseaualumni;
	}

	public int getNbreentreprisesauforum() {
		return nbreentreprisesauforum;
	}

	public void setNbreentreprisesauforum(int nbreentreprisesauforum) {
		this.nbreentreprisesauforum = nbreentreprisesauforum;
	}

	public int getNbrealumniauconseildadministrationcac40() {
		return nbrealumniauconseildadministrationcac40;
	}

	public void setNbrealumniauconseildadministrationcac40(int nbrealumniauconseildadministrationcac40) {
		this.nbrealumniauconseildadministrationcac40 = nbrealumniauconseildadministrationcac40;
	}
	@Override
	public String toString() {
		return "DescriptionProximiteDesEntreprises [salairealasortie=" + salairealasortie + ", reseaualumni=" +reseaualumni + ",nbreentreprisesauforum ="
				+ nbreentreprisesauforum + ", nbrealumniauconseildadministrationcac40=" + nbrealumniauconseildadministrationcac40+ ", nomEcole=" + nomEcole + "]";
	}
}
