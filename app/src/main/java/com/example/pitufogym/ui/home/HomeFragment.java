package com.example.pitufogym.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pitufogym.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private HomeAdapter adapter;
    private List<HomeItem> listaHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listaHome = new ArrayList<>();
        listaHome.add(new HomeItem("https://www.mipielsana.com/wp-content/uploads/2017/08/formato-para-rutina-gym.jpg", "Biel\nPecho, Tríceps y Hombro"));
        listaHome.add(new HomeItem("https://ejerciciosencasa.as.com/wp-content/uploads/2015/05/rutina.jpg", "Aaron\nEspalda, Bíceps y Antebrazo"));
        listaHome.add(new HomeItem("https://lh6.googleusercontent.com/w5AODvZIoPC0oC4DGirMP3eeXKjEOvThxo0dbwFFYnf6ec9YJlVTPphmQqL8mKfqmTwqjjhUwumv7F4BPZ7wtF03Yvwa1zHhubY7ytW5Jdy3wXKP-7mTW6jE4ZmpbYuEEwqS83iXMGXdoW7ycacDH_o", "Baki\nHombros"));

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter = new HomeAdapter(requireContext(), listaHome);
        recyclerView.setAdapter(adapter);

        NavController navController = NavHostFragment.findNavController(this);

        ImageButton botonTienda = view.findViewById(R.id.botonTienda);

        botonTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.tiendaFragment);
            }
        });

        return view;
    }
}
