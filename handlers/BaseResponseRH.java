package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.BaseCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;

import retrofit2.Response;



public class BaseResponseRH extends BaseRH<BaseResponse> {

    BaseCallback baseCallback;

    public BaseResponseRH(BaseCallback baseCallback){
        this.baseCallback = baseCallback;
    }


    @Override
    protected void onSuccess(Response<BaseResponse> response) {
        this.baseCallback.onSuccess(response.body());

    }

    @Override
    public void onFailure(BaseResponse response) {
        this.baseCallback.onFailure(response);
    }
}
