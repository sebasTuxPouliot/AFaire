package com.example.spouliot.afaire;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
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
                Log.d("click sur fab : ", "done");
                Intent intent = new Intent(MainActivity.this, AjoutAFaire.class);
                startActivity(intent);
            }
        });

        List<Tache> l = new ArrayList<>();
        l.add(new Tache(1, "me laver", Color.RED));
        l.add(new Tache(2, "embrasser Caro dans le cou", Color.BLUE));
        l.add(new Tache(3, "embrasser Caro sur les lèvres", Color.YELLOW));
        TacheAdapteur adapter2 = new TacheAdapteur(this, R.layout.une_tache, l);

        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);
        lvAFaire.setAdapter(adapter2);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.ajouterTache();
        databaseHandler.getTaches();
    }
}
