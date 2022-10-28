package com.example.mutipleactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {

    public KulinerAdapter(ArrayList<Kuliner> listKuliner) {
        this.ListKuliner = listKuliner;
    }

    private ArrayList<Kuliner> ListKuliner;


    @NonNull
    @Override
    public KulinerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder  holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent));

        return holder;
    }
        @Override
        public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {
            Kuliner kuliner =   ListKuliner.get(position);
                holder.txtNama.setText(kuliner.getNama());
                holder.txtAlamat.setText(kuliner.getAlamat());
                holder.imgFoto.setImageResource(kuliner.getId_gambar());
        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

                public TextView txtNama,    txtAlamat;
                public  ImageView   imgFoto;

             public ViewHolder(@NonNull View itemView) {
                 super(itemView);
                 txtNama =   (TextView) itemView.findViewById(R.id.txtNama);
                 txtAlamat  =    (TextView) itemView.findViewById(R.id.txtAlamat);
                 imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            }
        }


}
