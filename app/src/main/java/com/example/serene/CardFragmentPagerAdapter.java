package com.example.serene;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.serene.model.Categories;

import java.util.ArrayList;
import java.util.List;

public class CardFragmentPagerAdapter extends RecyclerView.Adapter<CardFragmentPagerAdapter.CardViewViewHolder>{
    private ArrayList<Categories> listCategories;

    public CardFragmentPagerAdapter(ArrayList<Categories> list) {
        this.listCategories = list;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewpager,parent,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position){
        final Categories categories = listCategories.get(position);

        Glide.with(holder.itemView.getContext())
                .load(categories.getImage())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);


    }


    @Override
    public int getItemCount() {
        return listCategories.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName;
        TextView descCompany;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);


        }
    }


}