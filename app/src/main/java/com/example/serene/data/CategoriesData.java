package com.example.serene.data;

import com.example.serene.R;
import com.example.serene.model.Categories;

import java.util.ArrayList;

public class CategoriesData {
    private static int[] categoriesImage= {
            R.drawable.categories1,
            R.drawable.categories2,
            R.drawable.categories3

    };

    public static ArrayList<Categories> getListData() {
        ArrayList<Categories> list = new ArrayList<>();
        for (int position = 0; position < categoriesImage.length; position++) {
            Categories categories = new Categories();
            categories.setImage(categoriesImage[position]);
            list.add(categories);
        }
        return list;
    }


}
