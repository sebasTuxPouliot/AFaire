package com.example.spouliot.afaire;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.util.Log;

import java.util.List;

/**
 * Created by spouliot on 17-09-09.
 */

/**
 * Classe qui sert à créer la base et la table au besoin.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_REVISION = 1;
    private static final String DATABASE_NAME = "sqlIntra";
    private static final String NOM_TABLE = "taches";
    private static final String CLE_ID = "id";
    private static final String CLE_TITRE = "titre";
    private static final String CLE_TYPE = "type";

    /**
     * Extrait de la doc : Create a helper object to create, open, and/or manage a database
     * @param context
     */
    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_REVISION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREER_TABLE_TACHES = "CREATE TABLE " + NOM_TABLE + "("
                + CLE_ID + " INTEGER PRIMARY KEY," + CLE_TITRE + " TEXT,"
                + CLE_TYPE + " INT" + ")";
        db.execSQL(CREER_TABLE_TACHES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // TODO : rien
    }

    /*
    Méthodes d'ajout et d'extraction
     */

    public void ajouterTache(){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues uneTache = new ContentValues();
        uneTache.put(CLE_TITRE, "une tache bidon");
        uneTache.put(CLE_TYPE, Color.BLUE);

        db.insert(NOM_TABLE, null, uneTache);
        db.close();
    }

    public List<Tache> getTaches(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c =  db.rawQuery("SELECT * FROM " + NOM_TABLE, null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            Log.d("contient : ", c.getString(2));
            c.moveToNext();
        }
        Log.d("fait : ", "pte vide");
        db.close();
        return null;
    }
}
