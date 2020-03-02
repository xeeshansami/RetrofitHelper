package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.BaseCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SignUpUserCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignUpResponse;

import retrofit2.Response;

public class UpdateProfileRH extends BaseRH<BaseResponse> {

    BaseCallback baseCallback;

    public UpdateProfileRH(BaseCallback baseCallback) {
        this.baseCallback = baseCallback;
    }

    @Override
    protected void onSuccess(Response<BaseResponse> response) {
        baseCallback.onSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        baseCallback.onFailure(response);
    }
}

