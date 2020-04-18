package com.example.serene.data;

import com.example.serene.R;
import com.example.serene.model.Article;
import com.example.serene.model.Categories;

import java.util.ArrayList;
import java.util.Collection;

public class ArticlesData {
    private static String[] articleTitle = {
            "Boost your self confidence",
            "You don't deserve to be sad",
            "How to be a winner"
    };

    private static String[] articleAuthor = {
            "by Syahshiyah R",
            "by Intsany R",
            "by Lulu Liani"
    };
    private static String[] articleDate = {
            "17/04/2020",
            "15/04/2020",
            "20/03/2020"
    };

    private static int[] articleImages = {
            R.drawable.article1,
            R.drawable.article2,
            R.drawable.article1

    };

    public static ArrayList<Article> getListData() {
        ArrayList<Article> list = new ArrayList<>();
        for (int position = 0; position < articleTitle.length; position++) {
            Article articles= new Article();
            articles.setTitle(articleTitle[position]);
            articles.setAuthor(articleAuthor[position]);
            articles.setDate(articleDate[position]);
            articles.setImage(articleImages[position]);
            list.add(articles);
        }
        return list;
    }
}
