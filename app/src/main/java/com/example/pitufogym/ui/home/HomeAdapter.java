package com.example.pitufogym.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pitufogym.R;
import com.example.pitufogym.ui.home.HomeItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private Context context;
    private List<HomeItem> listaHome;

    public HomeAdapter(Context context, List<HomeItem> listaHome) {
        this.context = context;
        this.listaHome = listaHome;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_home, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeItem currentItem = listaHome.get(position);

        Picasso.get()
                .load(currentItem.getImageUrl())
                .into(holder.imageView);

        holder.textView.setText(currentItem.getText());
    }

    @Override
    public int getItemCount() {
        return listaHome.size();
    }
}
