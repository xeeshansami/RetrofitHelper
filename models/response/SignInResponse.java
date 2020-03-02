package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Category;
import com.gatakalfzzah.consumer.models.User;

import java.util.ArrayList;


public class SignInResponse extends BaseResponse {
    private String access_token;
    private String token_type;
    private User user;
    private ArrayList<Category> categories;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
