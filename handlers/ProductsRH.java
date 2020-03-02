package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.CategoriesCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ProductsCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.VendorProductResponse;

import retrofit2.Response;


public class ProductsRH extends BaseRH<VendorProductResponse> {

    ProductsCallback productsCallback;

    public ProductsRH(ProductsCallback productsCallback){
        this.productsCallback = productsCallback;
    }

    @Override
    protected void onSuccess(Response<VendorProductResponse> response) {
        productsCallback.onProductsSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        productsCallback.onProductsFailure(response);
    }
}
