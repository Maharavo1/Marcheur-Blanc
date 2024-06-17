
package Projet1.MarcheurBlanc;

import Projet1.MarcheurBlanc.model.Lieu;
import Projet1.MarcheurBlanc.model.Marcher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MarcheurBlancApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMarcherVers() {
		// Créer les lieux avec les connexions
		Lieu HEI_Pullman = new Lieu("HEI", "Pullman");
		Lieu HEI_Nexta = new Lieu("HEI", "Nexta");
		Lieu HEI_Balancoire = new Lieu("HEI", "Balançoire");
		Lieu HEI_BoulevardDeLEurope = new Lieu("HEI", "BoulevardEurope");
		Lieu HEI_ESTI = new Lieu("HEI", "ESTI");
		Lieu HEI_Sekolintsika = new Lieu("HEI", "Sekolintsika");
		Lieu HEI_Marais = new Lieu("HEI", "Marais");

		Lieu Pullman_HEI = new Lieu("Pullman", "HEI");
		Lieu Pullman_Nexta = new Lieu("Pullman", "Nexta");
		Lieu Pullman_Sekolintsika = new Lieu("Pullman", "Sekolintsika");
		Lieu Pullman_BoulevardDeLEurope = new Lieu("Pullman", "BoulevardEurope");
		Lieu Pullman_Marais = new Lieu("Pullman", "Marais");
		Lieu Pullman_ESTI = new Lieu("Pullman", "ESTI");
		Lieu Pullman_Balancoire = new Lieu("Pullman", "Balançoire");

		Lieu Balancoire_Pullman = new Lieu("Balançoire", "Pullman");
		Lieu Balancoire_ESTI = new Lieu("Balançoire", "ESTI");
		Lieu Balancoire_Nexta = new Lieu("Balançoire", "Nexta");
		Lieu Balancoire_HEI = new Lieu("Balançoire", "HEI");
		Lieu Balancoire_BoulevardDelEurope = new Lieu("Balançoire", "BoulevardEurope");
		Lieu Balancoire_Marais = new Lieu("Balançoire", "Marais");
		Lieu Balancoire_Sekolintsika = new Lieu("Balançoire", "Sekolintsika");

		Lieu ESTI_Balancoire = new Lieu("ESTI", "Balançoire");
		Lieu ESTI_HEI = new Lieu("ESTI", "HEI");
		Lieu ESTI_Nexta = new Lieu("ESTI", "Nexta");
		Lieu ESTI_BoulevardDelEUROPE = new Lieu("ESTI", "BoulevardEurope");
		Lieu ESTI_Sekolintsika = new Lieu("ESTI", "Sekolintsika");
		Lieu ESTI_Marais = new Lieu("ESTI", "Marais");
		Lieu ESTI_Pullman = new Lieu("ESTI", "Pullman");

		Lieu Marais_Sekolintsika = new Lieu("Marais", "Sekolintsika");
		Lieu Marais_HEI = new Lieu("Marais", "HEI");
		Lieu Marais_Pullman = new Lieu("Marais", "Pullman");
		Lieu Marais_Balancoire = new Lieu("Marais", "Balançoire");
		Lieu Marais_Nexta = new Lieu("Marais", "Nexta");
		Lieu Marais_BoulevardDeLEurope = new Lieu("Marais", "BoulevardEurope");
		Lieu Marais_ESTI = new Lieu("Marais", "ESTI");

		Lieu Sekolintsika_HEI = new Lieu("Sekolintsika", "HEI");
		Lieu Sekolintsika_Nexta = new Lieu("Sekolintsika", "Nexta");
		Lieu Sekolintsika_Pullman = new Lieu("Sekolintsika", "Pullman");
		Lieu Sekolintsika_BoulevardDelEurope = new Lieu("Sekolintsika", "BoulevardEurope");
		Lieu Sekolintsika_Marais = new Lieu("Sekolintsika", "Marais");
		Lieu Sekolintsika_Balancoire = new Lieu("Sekolintsika", "Balançoire");
		Lieu Sekolintsika_ESTI = new Lieu("Sekolintsika", "ESTI");

		Lieu BoulevardEurope_HEI = new Lieu("BoulevardEurope", "HEI");
		Lieu BoulevardEurope_Nexta = new Lieu("BoulevardEurope", "Nexta");
		Lieu BoulevardEurope_Pullman = new Lieu("BoulevardEurope", "Pullman");
		Lieu BoulevardEurope_Marais = new Lieu("BoulevardEurope", "Marais");
		Lieu BoulevardEurope_Sekolintsika = new Lieu("BoulevardEurope", "Sekolintsika");
		Lieu BoulevardEurope_ESTI = new Lieu("BoulevardEurope", "ESTI");

		List<Lieu> trajets = Arrays.asList(
				HEI_Pullman, HEI_Nexta, HEI_Balancoire, HEI_BoulevardDeLEurope, HEI_ESTI, HEI_Sekolintsika, HEI_Marais,
				Pullman_HEI, Pullman_Nexta, Pullman_Sekolintsika, Pullman_BoulevardDeLEurope, Pullman_Marais, Pullman_ESTI, Pullman_Balancoire,
				Balancoire_Pullman, Balancoire_ESTI, Balancoire_Nexta, Balancoire_HEI, Balancoire_BoulevardDelEurope, Balancoire_Marais, Balancoire_Sekolintsika,
				ESTI_Balancoire, ESTI_HEI, ESTI_Nexta, ESTI_BoulevardDelEUROPE, ESTI_Sekolintsika, ESTI_Marais, ESTI_Pullman,
				Marais_Sekolintsika, Marais_HEI, Marais_Pullman, Marais_Balancoire, Marais_Nexta, Marais_BoulevardDeLEurope, Marais_ESTI,
				Sekolintsika_HEI, Sekolintsika_Nexta, Sekolintsika_Pullman, Sekolintsika_BoulevardDelEurope, Sekolintsika_Marais, Sekolintsika_Balancoire, Sekolintsika_ESTI,
				BoulevardEurope_HEI, BoulevardEurope_Nexta, BoulevardEurope_Pullman, BoulevardEurope_Marais, BoulevardEurope_Sekolintsika, BoulevardEurope_ESTI
		);

		// Marcher de HEI vers ESTI
		Marcher marcheur = new Marcher("HEI", trajets);
		List<String> parcours = marcheur.marcherVers("ESTI");

		//Marcher de Pullman vers HEI
		Marcher marcheurDeux = new Marcher("Pullman", trajets);
		List<String> parcoursDeux = marcheurDeux.marcherVers("HEI");

		//Marcher de Marais vers Sekolintsika
		Marcher marcheurTrois = new Marcher("Marais", trajets);
		List<String> parcoursTrois = marcheurTrois.marcherVers("Sekolintsika");


		// Afficher les parcours
		System.out.println("Parcours de HEI à ESTI:");
		for (String lieu : parcours) {
			System.out.println(lieu);
		}
		System.out.println("Parcours de Pullman vers HEI:");
		for (String lieu : parcoursDeux) {
			System.out.println(lieu);
		}
		System.out.println("Parcours de Marais à Sekolintsika:");
		for (String lieu : parcoursTrois) {
			System.out.println(lieu);
		}

	}
}
