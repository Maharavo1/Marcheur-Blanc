package Projet1.MarcheurBlanc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Marcheur {
    private final Carte carte;
    private final String name;

    public Marcheur(String name, Carte carte) {
        this.name = name;
        this.carte = carte;
    }

    public List<Lieu> marcher(Lieu lieuDeDepart, Lieu lieuArriver) {
        var chiffresAleatoires = new Random();
        List<Lieu> lieus = new ArrayList<>();
        Lieu positionInitial = lieuDeDepart;
        lieus.add(positionInitial);

        while (!positionInitial.equals(lieuArriver)) {
            List<Lieu> lieuxVoisins = getLieuxVoisins(positionInitial);
            positionInitial = lieuAleatoirement(lieuxVoisins, chiffresAleatoires);
            lieus.add(positionInitial);
        }

        return lieus;
    }

    private List<Lieu> getLieuxVoisins(Lieu positionInitial) {
        Set<Rue> rues = carte.getRues();
        return rues.stream()
                .filter(rue -> rue.getLieuA().equals(positionInitial) || rue.getLieuB().equals(positionInitial))
                .map(rue -> getLieuSuivant(rue, positionInitial))
                .toList();
    }

    private Lieu getLieuSuivant(Rue rue, Lieu positionInitial) {
        if (rue.getLieuA().equals(positionInitial)) {
            return rue.getLieuB();
        } else {
            return rue.getLieuA();
        }
    }

    private Lieu lieuAleatoirement(List<Lieu> lieux, Random chiffresAleatoires) {
        return lieux.get(chiffresAleatoires.nextInt(lieux.size()));
    }
}
