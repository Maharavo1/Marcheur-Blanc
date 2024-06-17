
package Projet1.MarcheurBlanc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Marcher {
    private String lieuActuel;
    private List<Lieu> parcours;
    private List<Lieu> trajets;

    public Marcher(String depart, List<Lieu> trajets) {
        this.lieuActuel = depart;
        this.parcours = new ArrayList<>();
        this.trajets = trajets;
    }

    public List<String> marcherVers(String destination) {
        Random random = new Random();

        // Ajouter le point de départ
        parcours.add(new Lieu(lieuActuel, lieuActuel));

        while (!lieuActuel.equals(destination)) {
            List<Lieu> voisins = trajets.stream()
                    .filter(lieu -> lieu.getLieuDepart().equals(lieuActuel))
                    .collect(Collectors.toList());

            if (voisins.isEmpty()) {
                // S'il n'y a pas de chemin disponible, recommencer depuis le début
                lieuActuel = parcours.get(0).getLieuDepart();
                parcours.clear();

                // Ajouter à nouveau le point de départ
                parcours.add(new Lieu(lieuActuel, lieuActuel));
                continue;
            }

            Lieu prochainLieu = voisins.get(random.nextInt(voisins.size()));
            parcours.add(prochainLieu);
            lieuActuel = prochainLieu.getLieuArrive();
        }

        // Convertir les parcours en une liste de noms pour plus de simplicité
        return parcours.stream().map(Lieu::getLieuArrive).collect(Collectors.toList());
    }
}
