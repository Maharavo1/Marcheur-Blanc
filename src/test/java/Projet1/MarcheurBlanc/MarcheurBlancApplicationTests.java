
package Projet1.MarcheurBlanc;

import Projet1.MarcheurBlanc.model.Carte;
import Projet1.MarcheurBlanc.model.Lieu;
import Projet1.MarcheurBlanc.model.Marcheur;
import Projet1.MarcheurBlanc.model.Rue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MarcheurBlancApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void bjarni_de_hei_vers_esti(){
		var marais = new Lieu("Marais");
		var sekolintsika = new Lieu("Sekolintsika");
		var hei = new Lieu("HEI");
		var pullman = new Lieu("Pullman");
		var balançoire = new Lieu("Balançoire");
		var boulevardDelEurope = new Lieu("Boulevard de l'Europe");
		var nexta = new Lieu("Nexta");
		var esti = new Lieu("ESTI");


		var rue1 = new Rue(marais, sekolintsika);
		var rue2 = new Rue(sekolintsika, hei);


		var carteC = new Carte(Set.of(rue1, rue2));
		var bjarni = new Marcheur("Bjarni", carteD);

		var Bjarni = bjarni.marcher(hei, esti);

		var LieuDeDépart = Bjarni.getFirst();
		var LieuDArrivée = Bjarni.getLast();


		assertEquals(hei, LieuDeDépart, "La marche commence à" + hei.nom());
		assertEquals(esti, LieuDArrivée, "La marche se termine à " + esti.nom());
		assertTrue("La marche de " + hei.nom() + " vers " + esti.nom());

	}
}
