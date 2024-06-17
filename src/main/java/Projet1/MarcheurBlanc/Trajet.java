
package Projet1.MarcheurBlanc;

import java.util.HashSet;
import java.util.Set;

public class Trajet {
    private Set<Lieu> lieux;

    public Trajet() {
        this.lieux = new HashSet<>();
    }

    public void ajouterLieu(Lieu lieu) {
        lieux.add(lieu);
    }

    public boolean contientLieu(Lieu lieu) {
        return lieux.contains(lieu);
    }

    public Set<Lieu> getLieux() {
        return lieux;
    }
}

