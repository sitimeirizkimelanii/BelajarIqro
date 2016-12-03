package id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro.R;
import id.sch.smktelkom_mlg.project.xiirpl304142434.belajariqro.model.Jusamma;

/**
 * Created by nurlinda on 12/1/2016.
 */
public class JusammaAdapter extends RecyclerView.Adapter<JusammaAdapter.ViewHolder> {
ArrayList<Jusamma> jusammaList;

    public JusammaAdapter(ArrayList<Jusamma> jusammaArrayList) {
        this.jusammaList = jusammaArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Jusamma jusamma = jusammaList.get(position);
        holder.tvJudul.setText(jusamma.judul);
        holder.tvDeskripsi.setText(jusamma.deskripsi);
        holder.ivFoto.setImageDrawable(jusamma.foto);
    }

    @Override
    public int getItemCount() {
        if(jusammaList!=null)
            return jusammaList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
