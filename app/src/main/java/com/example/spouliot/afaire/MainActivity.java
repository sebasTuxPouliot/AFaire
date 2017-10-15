package com.example.spouliot.afaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);
        List<Tache> l = new ArrayList<>();
        l.add(new Tache(1, "me laver", 45));
        l.add(new Tache(2, "embrasser Caro dans le cou", R.color.couleurUrgent));
        //ArrayAdapter<Tache> adapter2 = new ArrayAdapter<Tache>(this, R.layout.une_tache, R.id.tv_tache, l);
        TacheAdapteur adapter2 = new TacheAdapteur(this, R.layout.une_tache, l);
        lvAFaire.setAdapter(adapter2);
    }
}
