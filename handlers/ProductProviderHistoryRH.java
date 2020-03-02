package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.ProductProviderHistoryCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ProductProviderHistoryResponse;

import retrofit2.Response;

public class ProductProviderHistoryRH extends BaseRH<ProductProviderHistoryResponse> {

    ProductProviderHistoryCallBack productProviderHistoryCallBack;

    public ProductProviderHistoryRH(ProductProviderHistoryCallBack productProviderHistoryCallBack) {
       this.productProviderHistoryCallBack = productProviderHistoryCallBack;
    }


    @Override
    protected void onSuccess(Response<ProductProviderHistoryResponse> response) {
        productProviderHistoryCallBack.onBookingSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        productProviderHistoryCallBack.onBookingFailure(response);
    }
}
