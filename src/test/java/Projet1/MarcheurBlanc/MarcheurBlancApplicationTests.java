package Projet1.MarcheurBlanc;

import Projet1.MarcheurBlanc.model.Carte;
import Projet1.MarcheurBlanc.model.Lieu;
import Projet1.MarcheurBlanc.model.Marcheur;
import Projet1.MarcheurBlanc.model.Rue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MarcheurBlancApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void bjarni_de_hei_vers_esti() {
        var marais = new Lieu("Marais");
        var sekolintsika = new Lieu("Sekolintsika");
        var hei = new Lieu("HEI");
        var pullman = new Lieu("Pullman");
        var balancoire = new Lieu("Balançoire");
        var boulevardDelEurope = new Lieu("Boulevard de l'Europe");
        var nexta = new Lieu("Nexta");
        var esti = new Lieu("ESTI");

        var rue1 = new Rue("Rue 1", marais, sekolintsika);
        var rue2 = new Rue("Rue 2", sekolintsika, hei);

        var carte = new Carte(Set.of(rue1, rue2));
        var bjarni = new Marcheur("Bjarni", carte);

        var chemin = bjarni.marcher(hei, esti);

        var lieuDeDepart = chemin.get(0);
        var lieuDArrivee = chemin.get(chemin.size() - 1);

        assertEquals(hei, lieuDeDepart, "La marche commence à " + hei.getNom());
        assertEquals(esti, lieuDArrivee, "La marche se termine à " + esti.getNom());
        assertTrue(chemin.contains(hei) && chemin.contains(esti), "La marche de " + hei.getNom() + " vers " + esti.getNom());
    }
}
