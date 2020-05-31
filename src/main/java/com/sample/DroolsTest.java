package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			
			boolean knownprofessor = true;
			int nbreelevesparenseignant = 10;
		    float poucentageenseignantshdr=	0.3f;
			int moyenneaubacdesintegres = 18;int nbrealumniauconseildadministrationcac40=7;int nbrepublicationsparan=100;
			float poucentageetudiantsetrangers=0.5f;
			String niveauanglaisexige= "C1"; String dureeminimalealetranger ="6 mois";String reputationalinternational="trés bonne";String reseaualumni ="fort";
			String scoredeveloppementdurable="A";
			boolean ecoleengagee= true;
			String ecole = "MinesParis", typeecole = "prestigieuse ecole";
			int salairealasortie=50000;
			
			Avis avis = new Avis(ecole,"5");
			DescriptionExcellenceAcademique de = new DescriptionExcellenceAcademique(ecole, 18,false, 10,poucentageenseignantshdr,nbrepublicationsparan,typeecole);
			DescriptionOuvertureInternationale di = new DescriptionOuvertureInternationale(ecole, dureeminimalealetranger,reputationalinternational,poucentageetudiantsetrangers,"C1",scoredeveloppementdurable, ecoleengagee);
			DescriptionProximiteDesEntreprises dp = new DescriptionProximiteDesEntreprises(ecole,salairealasortie, reseaualumni,0,nbrealumniauconseildadministrationcac40);

			
			
			kSession.insert(de);
			kSession.insert(di);
			kSession.insert(dp);
			kSession.insert(avis);

			
			kSession.fireAllRules();

			for (Object o : kSession.getObjects()) {
				if (o instanceof Avis)
					System.out.println(o);
			}
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
