package com.best.a62j.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.best.a62j.R;
import com.best.a62j.User;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<User> list;

    public BasicAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_foradapter, parent, false);
        return new ViewMode(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        User user = list.get(position);


        if (holder instanceof ViewMode) {
            ImageView a = ((ViewMode) holder).imageView;
            TextView b = ((ViewMode) holder).textView;
            a.setImageResource(user.getImage());
            b.setText(user.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewMode extends RecyclerView.ViewHolder {
        View view;
        ImageView imageView;
        TextView textView;

        public ViewMode(View itemView) {
            super(itemView);
            this.view = itemView;
            imageView = itemView.findViewById(R.id.item_image);
            textView = itemView.findViewById(R.id.item_title);
        }
    }
}
