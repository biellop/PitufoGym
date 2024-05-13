package com.example.pitufogym;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TiendaFragment extends Fragment {
    NavController navController;
    Button botonMapa;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tienda, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonMapa = view.findViewById(R.id.boton_ubicacion);

        botonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_tiendaFragment_to_mapaTiendaFragment);
            }
        });
        RecyclerView gymEquipmentRecyclerView = view.findViewById(R.id.gym_equipment_recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        gymEquipmentRecyclerView.setLayoutManager(layoutManager);

        List<GymEquipmentItem> gymEquipmentList = createGymEquipmentList();

        GymEquipmentAdapter gymEquipmentAdapter = new GymEquipmentAdapter(gymEquipmentList);
        gymEquipmentRecyclerView.setAdapter(gymEquipmentAdapter);
    }


    private List<GymEquipmentItem> createGymEquipmentList() {
        List<GymEquipmentItem> equipmentList = new ArrayList<>();
        equipmentList.add(new GymEquipmentItem("Cinta de correr", "Equipo para correr en el lugar."));
        equipmentList.add(new GymEquipmentItem("Pesas", "Equipo para entrenamiento de fuerza."));
        return equipmentList;
    }
}
