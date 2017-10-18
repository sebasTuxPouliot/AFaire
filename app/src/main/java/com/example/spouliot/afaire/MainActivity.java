package com.example.spouliot.afaire;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAjoutAFaire = (FloatingActionButton) findViewById(R.id.fab_ajouter_a_faire);
        fabAjoutAFaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AjoutAFaire.class);
                startActivity(intent);
            }
        });

        remplirListe();
    }

    @Override
    protected void onResume() {
        super.onResume();
        remplirListe();
    }

    private void remplirListe(){
        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        List<Tache> l = databaseHandler.getTaches();
        TacheAdapteur adapteur = new TacheAdapteur(this, R.layout.une_tache, l);
        lvAFaire.setAdapter(adapteur);
    }
}
