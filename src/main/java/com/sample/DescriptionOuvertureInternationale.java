package com.sample;

public class DescriptionOuvertureInternationale extends Description {
	
	public DescriptionOuvertureInternationale(String nom, String dureeminimalealetranger, String reputationalinternational,
			float poucentageetudiantsetrangers, String niveauanglaisexige, String scoredeveloppementdurable,
			boolean ecoleengagee) {
		super(nom);
		this.dureeminimalealetranger = dureeminimalealetranger;
		this.reputationalinternational = reputationalinternational;
		this.poucentageetudiantsetrangers = poucentageetudiantsetrangers;
		this.niveauanglaisexige = niveauanglaisexige;
		this.scoredeveloppementdurable = scoredeveloppementdurable;
		this.ecoleengagee = ecoleengagee;
	}
	public String dureeminimalealetranger ;
	
	public String reputationalinternational;

	public float poucentageetudiantsetrangers ;
	
	public String niveauanglaisexige;

	public String scoredeveloppementdurable;
	
	public boolean ecoleengagee;
	


	public float getPourcentageetudiantsetrangers() {
		return poucentageetudiantsetrangers;
	}
	public void setPourcentageetudiantsetrangers(float pourcentageetudiantsetrangers) {
		this.poucentageetudiantsetrangers = pourcentageetudiantsetrangers;
	}
	public Object getScoredeveloppementdurable() {
		return scoredeveloppementdurable;
	}
	public void setScoredeveloppementdurable(String scoredeveloppementdurable) {
		this.scoredeveloppementdurable = scoredeveloppementdurable;
	}
	
	public String getDureeminimalealetranger() {
		return dureeminimalealetranger;
	}

	public void setDureeminimalealetranger(String dureeminimalealetranger) {
		this.dureeminimalealetranger = dureeminimalealetranger;
	}

	public String getReputationalinternational() {
		return reputationalinternational;
	}

	public void setReputationalinternational(String reputationalinternational) {
		this.reputationalinternational = reputationalinternational;
	}


	public String getNiveauanglaisexige() {
		return niveauanglaisexige;
	}
	public float getPoucentageetudiantsetrangers() {
		return poucentageetudiantsetrangers;
	}

	public void setPoucentageetudiantsetrangers(float poucentageetudiantsetrangers) {
		this.poucentageetudiantsetrangers = poucentageetudiantsetrangers;
	}

	public boolean isEcoleengagee() {
		return ecoleengagee;
	}

	public void setEcoleengagee(boolean ecoleengagee) {
		this.ecoleengagee = ecoleengagee;
	}

	public void setNiveauanglaisexige(String niveauanglaisexige) {
		this.niveauanglaisexige = niveauanglaisexige;
	}
	@Override
	public String toString() {
		return "DescriptionOuvertureInternationale [dureeminimalealetranger=" + dureeminimalealetranger+ ", reputationalinternational=" + reputationalinternational+ ",pourcentageetudiantsetrangers ="
				+ poucentageetudiantsetrangers + ", niveauanglaisexige=" + niveauanglaisexige+", ecoleengagee=" + ecoleengagee+", scoredeveloppementdurable=" + scoredeveloppementdurable+  ", nomEcole=" + nomEcole + "]";
	}
}