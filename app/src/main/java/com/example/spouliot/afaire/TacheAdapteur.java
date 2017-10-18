package com.example.spouliot.afaire;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by spouliot on 17-10-15.
 */

public class TacheAdapteur extends ArrayAdapter<Tache> {
    List<Tache> listeDeTaches;

    public TacheAdapteur(@NonNull Context context, @LayoutRes int resource, @NonNull List<Tache> listeDeTaches) {
        super(context, resource, listeDeTaches);
        this.listeDeTaches = listeDeTaches;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.une_tache, null);
        TextView mTitreTache = (TextView) v.findViewById(R.id.tv_tache);
        View mCouleurTache = (View) v.findViewById(R.id.v_couleur_tache);

        mTitreTache.setText(listeDeTaches.get(position).getTitreTache());
        mCouleurTache.setBackgroundColor(listeDeTaches.get(position).getTypeDeTache());
        return v;
    }
}
