package com.ddrssoft.exploradordefarmacias.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.ddrssoft.exploradordefarmacias.R;
import com.ddrssoft.exploradordefarmacias.databinding.FragmentHomeBinding;
import com.google.android.gms.maps.SupportMapFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        homeViewModel.getMMapa().observe(getViewLifecycleOwner(), new Observer<HomeViewModel.MapaActual>() {
            @Override
            public void onChanged(HomeViewModel.MapaActual mapaActual) {
                SupportMapFragment smf=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
                smf.getMapAsync(mapaActual);
            }
        });
        // Llamar a ultima ubicacion
        homeViewModel.obtenerUltimaUbicacion();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}