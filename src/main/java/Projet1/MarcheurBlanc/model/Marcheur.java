package Projet1.MarcheurBlanc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Marcheur(Carte carte , String name) {


    public List<Lieu> marcher(Lieu lieuDeDépart, Lieu lieuArriver) {
        var chiffresAléatoires = new Random();
        List<Lieu> lieus = new ArrayList<>();
        Lieu positionInitial = lieuDeDépart;
        lieus.add(positionInitial);

        while (!positionInitial.equals(lieuArriver)) {
            List<Lieu> lieuxVoisins = LieuVoisins(positionInitial);
            positionInitial = LieuAléatoirement(lieuxVoisins, chiffresAléatoires);
            lieus.add(positionInitial);
        }

        return lieus;
    }

    private List<Lieu> LieuVoisins(
            Lieu positionInitial
    ) {
        Set<Rue> rues = carte.rues();
        return rues.stream()
                .filter(rue -> rue.getLieuA().equals(positionInitial) || rue.getLieuB().equals(positionInitial))
                .map(rue -> LieuSuivant(rue, positionInitial))
                .toList();
    }

    private Lieu LieuSuivant(Rue rue, Lieu positionInitial) {
        Lieu lieuSuivant = null;
        if (rue.getLieuA().equals(positionInitial)) lieuSuivant = rue.getLieuB();
        if (rue.getLieuB().equals(positionInitial)) lieuSuivant = rue.getLieuB();
        return lieuSuivant;
    }

    private Lieu LieuAléatoirement(List<Lieu> lieux, Random chiffresAléatoires) {
        return lieux.get(chiffresAléatoires.nextInt(lieux.size()));
    }
}
