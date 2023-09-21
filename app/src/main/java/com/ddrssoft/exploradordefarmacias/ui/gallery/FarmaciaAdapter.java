package com.ddrssoft.exploradordefarmacias.ui.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.ddrssoft.exploradordefarmacias.R;
import com.ddrssoft.exploradordefarmacias.modelo.Farmacia;

import java.io.Serializable;
import java.util.List;

public class FarmaciaAdapter extends RecyclerView.Adapter<FarmaciaAdapter.ViewHolder> {
    private List<Farmacia> farmacia;
    private Context context;
    private LayoutInflater li;

    public FarmaciaAdapter(List<Farmacia> farmacia, Context context, LayoutInflater li){
        this.farmacia = farmacia;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    public FarmaciaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item_farmacia,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FarmaciaAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(farmacia.get(position).getNombre());
        holder.direccion.setText(farmacia.get(position).getNombre());
        /*holder.telefono.setText(farmacia.get(position).getTelefono());
        holder.horario.setText(farmacia.get(position).getHorario());
        holder.foto.setText(farmacia.get(position).getFoto());*/
    }

    @Override
    public int getItemCount() {
        return farmacia.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private TextView direccion;
        public ViewHolder(@NonNull View view) {
            super(view);
            nombre = itemView.findViewById(R.id.tvNombre);
            /*Bundle bundle = new Bundle();
            bundle.putSerializable("lugar", farmacia.get(getAdapterPosition()));
            Intent intent = new Intent();
            intent.putExtras(bundle);
            view.getContext().startActivity(intent);*/
        }

    }
}

  /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("farmacia", (Serializable) farmacia);
                    Navigation.findNavController(view).navigate(R.id.nav_detalles,bundle);

                }
            });*/