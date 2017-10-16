package com.example.spouliot.afaire;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjoutAFaire extends AppCompatActivity {
    Tache nouvelleTache = new Tache();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_afaire);

        Button btnAjouterTache = (Button) findViewById(R.id.btn_ajouter_tache);
        btnAjouterTache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etNouvelleTache = (EditText) findViewById(R.id.et_titre_tache);
                nouvelleTache.titreTache = etNouvelleTache.getText().toString();
                Log.d("titre de tache : ", nouvelleTache.titreTache.toString());
                Log.d("couleur tache : ", nouvelleTache.typeDeTache + "");
                finish();
            }
        });

        View vCouleurBleu = (View) findViewById(R.id.v_couleur_bleu);
        View vCouleurRouge = (View) findViewById(R.id.v_couleur_rouge);
        View vCouleurVert = (View) findViewById(R.id.v_couleur_vert);

        vCouleurBleu.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                nouvelleTache.typeDeTache = Color.BLUE;
            }
        });

        vCouleurRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nouvelleTache.typeDeTache = Color.RED;
            }
        });

        vCouleurVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nouvelleTache.typeDeTache = Color.GREEN;
            }
        });
    }

}
