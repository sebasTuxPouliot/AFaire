package com.example.spouliot.afaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvAFaire = (ListView) findViewById(R.id.lv_a_faire);
        ArrayList<Tache> l = new ArrayList<>();
        l.add(new Tache(1, "me laver"));
        l.add(new Tache(2, "embrasser Caro dans le cou"));
        ArrayAdapter<Tache> adapter2 = new ArrayAdapter<Tache>(this, R.layout.une_tache, R.id.tv_tache, l);
        lvAFaire.setAdapter(adapter2);
    }
}
