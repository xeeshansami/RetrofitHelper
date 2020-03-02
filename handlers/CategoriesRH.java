package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.CategoriesCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;

import retrofit2.Response;


public class CategoriesRH extends BaseRH<CategoriesResponse> {

    CategoriesCallback categoriesCallback;

    public CategoriesRH(CategoriesCallback categoriesCallback){
        this.categoriesCallback = categoriesCallback;
    }

    @Override
    protected void onSuccess(Response<CategoriesResponse> response) {
        categoriesCallback.onCategoriesSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        categoriesCallback.onCategoriesFailure(response);
    }
}
