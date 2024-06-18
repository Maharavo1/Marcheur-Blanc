package Projet1.MarcheurBlanc.model;

import java.util.Set;

public class Carte {
    private final Set<Rue> rues;

    public Carte(Set<Rue> rues) {
        this.rues = rues;
    }

    public Set<Rue> getRues() {
        return rues;
    }
}
