package com.example.pitufogym;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GymEquipmentAdapter extends RecyclerView.Adapter<GymEquipmentAdapter.GymEquipmentViewHolder> {

    private List<GymEquipmentItem> gymEquipmentList;

    public GymEquipmentAdapter(List<GymEquipmentItem> gymEquipmentList) {
        this.gymEquipmentList = gymEquipmentList;
    }

    @NonNull
    @Override
    public GymEquipmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gym_equipment_item, parent, false);
        return new GymEquipmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GymEquipmentViewHolder holder, int position) {
        GymEquipmentItem gymEquipmentItem = gymEquipmentList.get(position);
        holder.titleTextView.setText(gymEquipmentItem.getTitle());
        holder.descriptionTextView.setText(gymEquipmentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return gymEquipmentList.size();
    }

    static class GymEquipmentViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;

        GymEquipmentViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.gym_equipment_item_title);
            descriptionTextView = itemView.findViewById(R.id.gym_equipment_item_description);
        }
    }
}