package Projet1.MarcheurBlanc.model;
public class Rue {
    private final String nom;
    private final Lieu lieuA;
    private final Lieu lieuB;

    public Rue(String nom, Lieu lieuA, Lieu lieuB) {
        this.nom = nom;
        this.lieuA = lieuA;
        this.lieuB = lieuB;
    }

    public String getNom() {
        return nom;
    }

    public Lieu getLieuA() {
        return lieuA;
    }

    public Lieu getLieuB() {
        return lieuB;
    }
}