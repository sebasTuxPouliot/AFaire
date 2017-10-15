package com.example.spouliot.afaire;

import android.graphics.Color;

/**
 * Created by spouliot on 17-10-15.
 */

public class Tache {
    int idTache;
    String titreTache;
    int typeDeTache; // une couleur définie dans le fichier colors.xml


    public Tache(int idTache, String titreTache, int typeDeTache){
        this.idTache = idTache;
        this.titreTache = titreTache;
        this.typeDeTache = typeDeTache;
    }

    @Override
    public String toString() {
        return titreTache;
    }
}
