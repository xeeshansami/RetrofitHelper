package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.BaseCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;

import retrofit2.Response;

public class CheckEmailRH extends BaseRH<BaseResponse> {

    BaseCallback callback;

    public CheckEmailRH(BaseCallback CallBack) {
        this.callback = CallBack;
    }

    @Override
    protected void onSuccess(Response<BaseResponse> response) {
        this.callback.onSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        this.callback.onFailure(response);
    }
}

