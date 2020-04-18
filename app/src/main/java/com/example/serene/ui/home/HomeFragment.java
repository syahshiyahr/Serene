package com.example.serene.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.serene.ArticlesAdapter;
import com.example.serene.CardFragmentPagerAdapter;
import com.example.serene.R;
import com.example.serene.data.ArticlesData;
import com.example.serene.data.CategoriesData;
import com.example.serene.model.Article;
import com.example.serene.model.Categories;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ImageView iv_pager;
    private RecyclerView rvCard, rvArticles;
    private ArrayList<Categories> list = new ArrayList<>();
    private ArrayList<Article> list2 = new ArrayList<>();


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvArticles = view.findViewById(R.id.rv_article);
        rvCard = view.findViewById(R.id.rv_categories);
        rvCard.setHasFixedSize(true);
        rvArticles.setHasFixedSize(true);


        list.addAll(CategoriesData.getListData());
        rvCard.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        CardFragmentPagerAdapter cvCardAdapter = new CardFragmentPagerAdapter(list);
        rvCard.setAdapter(cvCardAdapter);

        list2.addAll(ArticlesData.getListData());
//        Toast.makeText(getActivity(), String.valueOf(list2.size()), Toast.LENGTH_SHORT).show();
//        Log.d("jumlah data: ", String.valueOf(list2.size()));
        rvArticles.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        ArticlesAdapter articlesAdapter = new ArticlesAdapter(list2);
        rvArticles.setAdapter(articlesAdapter);

    }
}