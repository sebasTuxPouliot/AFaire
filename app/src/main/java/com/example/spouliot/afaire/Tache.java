package com.example.spouliot.afaire;

import android.graphics.Color;

/**
 * Created by spouliot on 17-10-15.
 */

public class Tache {
    private int idTache;
    private String titreTache;
    private int typeDeTache; // une couleur provenant de Color.XXXX ou XXXX este une couleur


    public Tache(){};

    public Tache(int idTache, String titreTache, int typeDeTache){
        this.idTache = idTache;
        this.titreTache = titreTache;
        this.typeDeTache = typeDeTache;
    }

    public void setTitreTache(String titreTache) {
        this.titreTache = titreTache;
    }

    public void setTypeDeTache(int typeDeTache) {
        this.typeDeTache = typeDeTache;
    }

    public int getIdTache() {

        return idTache;
    }

    public String getTitreTache() {
        return titreTache;
    }

    public int getTypeDeTache() {
        return typeDeTache;
    }

    @Override
    public String toString() {
        return titreTache;
    }
}
