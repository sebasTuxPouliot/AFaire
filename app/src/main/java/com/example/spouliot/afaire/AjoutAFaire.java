package com.example.spouliot.afaire;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                nouvelleTache.setTitreTache(etNouvelleTache.getText().toString());

                DatabaseHandler db = new DatabaseHandler(AjoutAFaire.this);
                db.ajouterTache(nouvelleTache);

                finish();
            }
        });

        View vCouleurBleu = (View) findViewById(R.id.v_couleur_bleu);
        View vCouleurRouge = (View) findViewById(R.id.v_couleur_rouge);
        View vCouleurVert = (View) findViewById(R.id.v_couleur_vert);

        vCouleurBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nouvelleTache.setTypeDeTache(Color.BLUE);
                Toast.makeText(AjoutAFaire.this, "Cette tâche sera codée bleu", Toast.LENGTH_SHORT).show();
            }
        });

        vCouleurRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nouvelleTache.setTypeDeTache(Color.RED);
                Toast.makeText(AjoutAFaire.this, "Cette tâche sera codée en rouge", Toast.LENGTH_SHORT).show();
            }
        });

        vCouleurVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nouvelleTache.setTypeDeTache(Color.GREEN);
                Toast.makeText(AjoutAFaire.this, "Cette tâche sera codée en vert", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
