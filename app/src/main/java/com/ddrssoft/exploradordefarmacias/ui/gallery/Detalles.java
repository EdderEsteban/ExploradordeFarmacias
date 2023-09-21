package com.ddrssoft.exploradordefarmacias.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.ddrssoft.exploradordefarmacias.R;
import com.ddrssoft.exploradordefarmacias.modelo.Farmacia;

import java.util.List;

public class Detalles extends Fragment {

    private ImageView ivFoto;
    private TextView tvTelefono;
    private TextView tvHorario;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalles, container, false);

        ivFoto = view.findViewById(R.id.ivfoto);
        tvTelefono = view.findViewById(R.id.tvTelefono);
        tvHorario = view.findViewById(R.id.tvHorario);

        // Recuperar los datos de la farmacia del Bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            Farmacia farmacia = (Farmacia) bundle.getSerializable("farmacia");
            if (farmacia != null) {
                tvTelefono.setText("Teléfono: " + farmacia.getTelefono());
                tvHorario.setText("Horario: " + farmacia.getHorario());

                Glide.with(requireContext())
                        .load(farmacia.getFoto())
                        .into(ivFoto);
            }
        }


        return view;
    }
}
