package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.request.OrderProduct;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.OrderProductRequest;

public interface OrderBuyCallBack {
    void onSuccess(OrderProductRequest response);
    void onFailure(BaseResponse response);}
