package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro.adapter.JusammaAdapter;
import id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro.model.Jusamma;

public class jussamamain_Activity extends AppCompatActivity {
ArrayList<Jusamma> mList = new ArrayList<>();
    JusammaAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jussamamain_);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new JusammaAdapter(mList);
        recyclerView.setAdapter(mAdapter);
        
        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String [] arJudul = resources.getStringArray(R.array.places);
        String [] arDeskripsi = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable [] arFoto = new Drawable[a.length()];
        for(int i = 0; i < arFoto.length; i++)
        {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();
        for(int i = 0; i<arJudul.length; i++)
        {
            mList.add(new Jusamma(arJudul[i],arDeskripsi[i],arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}
