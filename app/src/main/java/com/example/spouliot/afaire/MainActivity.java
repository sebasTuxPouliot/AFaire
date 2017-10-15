package com.example.spouliot.afaire;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);
        List<Tache> l = new ArrayList<>();
        l.add(new Tache(1, "me laver", Color.RED));
        l.add(new Tache(2, "embrasser Caro dans le cou", Color.BLUE));
        l.add(new Tache(3, "embrasser Caro sur les lèvres", Color.YELLOW));
        TacheAdapteur adapter2 = new TacheAdapteur(this, R.layout.une_tache, l);
        lvAFaire.setAdapter(adapter2);
    }
}
