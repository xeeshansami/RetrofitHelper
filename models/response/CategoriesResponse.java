package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Category;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class CategoriesResponse extends BaseResponse {

    @SerializedName("categories")
    private ArrayList<Category> categories;

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
