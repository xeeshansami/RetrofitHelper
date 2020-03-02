package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.OrderBuyCallBack;
import com.gatakalfzzah.consumer.network.models.request.OrderProduct;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.OrderProductRequest;

import retrofit2.Response;

/**
 * Created by subhan on 11/27/18.
 */

public class OrderBuyRH extends BaseRH<OrderProductRequest> {

    OrderBuyCallBack categoriesCallback;

    public OrderBuyRH(OrderBuyCallBack categoriesCallback){
        this.categoriesCallback = categoriesCallback;
    }

    @Override
    protected void onSuccess(Response<OrderProductRequest> response) {
        categoriesCallback.onSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        categoriesCallback.onFailure(response);
    }
}
