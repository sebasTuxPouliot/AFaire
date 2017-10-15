package com.example.spouliot.afaire;

/**
 * Created by spouliot on 17-10-15.
 */

public class Tache {
    int idTache;
    String titreTache;

    public Tache(int idTache, String titreTache){
        this.idTache = idTache;
        this.titreTache = titreTache;
    }

    @Override
    public String toString() {
        return titreTache;
    }
}
