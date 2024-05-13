package com.example.pitufogym.ui.perfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.pitufogym.R;
import com.example.pitufogym.databinding.FragmentPerfilBinding;

import de.hdodenhof.circleimageview.CircleImageView;

public class PerfilFragment extends Fragment {

    private FragmentPerfilBinding binding;
    private TextView profileName;
    private TextView descripcionBiel;
    Button botonEditPerfil;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPerfilBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        final CircleImageView profileImage = binding.profileImage;
        profileName = binding.profileName;
        descripcionBiel = binding.descripcionBiel;

        profileImage.setImageResource(R.drawable.foto_biel);
        profileName.setText("Biel");
        descripcionBiel.setText("Soy Biel López de Santa Coloma de Gramenet. \uD83C\uDFCB️\u200D♂️ Estudiante de DAM, me encanta el deporte y la tecnología");
        return root;

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonEditPerfil = view.findViewById(R.id.boton_editar_perfil);

        botonEditPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_navigation_perfil_to_editarPerfilFragment);
            }
        });

    }
    public void setDescripcionBiel(String descripcion) {
        descripcionBiel.setText(descripcion);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}