package com.example.pitufogym.ui.ejercicios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pitufogym.R;
import com.example.pitufogym.databinding.FragmentEjerciciosBinding;

public class EjerciciosFragment extends Fragment {

    private FragmentEjerciciosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EjerciciosViewModel ejerciciosViewModel =
                new ViewModelProvider(this).get(EjerciciosViewModel.class);

        binding = FragmentEjerciciosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Configura el TextView
        // Nota: El TextView del dashboard se ha eliminado según tu solicitud

        // Configura el RecyclerView para la primera fila
        RecyclerView recyclerView1 = root.findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        int[] imageResources1 = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
        MyRecyclerViewAdapter adapter1 = new MyRecyclerViewAdapter(imageResources1);
        recyclerView1.setAdapter(adapter1);

        // Configura el RecyclerView para la segunda fila
        RecyclerView recyclerView2 = root.findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        int[] imageResources2 = {R.drawable.image4, R.drawable.image5, R.drawable.image6};
        MyRecyclerViewAdapter adapter2 = new MyRecyclerViewAdapter(imageResources2);
        recyclerView2.setAdapter(adapter2);

        // Configura el RecyclerView para la tercera fila
        RecyclerView recyclerView3 = root.findViewById(R.id.recyclerView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        int[] imageResources3 = {R.drawable.image7, R.drawable.image8, R.drawable.image9};
        MyRecyclerViewAdapter adapter3 = new MyRecyclerViewAdapter(imageResources3);
        recyclerView3.setAdapter(adapter3);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
