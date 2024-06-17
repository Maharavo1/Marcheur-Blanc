package Projet1.MarcheurBlanc;

public class Lieu {
    private String lieuDepart;
    private String lieuArrive;

    public Lieu(String lieuDepart, String lieuArrive) {
        this.lieuDepart = lieuDepart;
        this.lieuArrive = lieuArrive;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public String getLieuArrive() {
        return lieuArrive;
    }
}

