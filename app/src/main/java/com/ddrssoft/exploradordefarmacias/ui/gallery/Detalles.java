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
import com.ddrssoft.exploradordefarmacias.databinding.FragmentDetallesBinding;

import com.ddrssoft.exploradordefarmacias.modelo.Farmacia;



public class Detalles extends Fragment {
    private FragmentDetallesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetallesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

    // Recuperar los datos de la farmacia del Bundle
        Bundle bundle = getArguments();
        Farmacia farmacia = (Farmacia) bundle.getSerializable("farmacia");
        binding.tvTelefono.setText("Teléfono: " + farmacia.getTelefono());
        binding.tvHorario.setText("Horario: " + farmacia.getHorario());
        Glide.with(requireContext())
                .load(farmacia.getFoto())
                .into(binding.ivfoto);

        return root;
    }
}