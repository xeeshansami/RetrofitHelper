package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.SingleEmployeeCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleEmployeeResponse;

import retrofit2.Response;




public class SingleEmployeeRH extends BaseRH<SingleEmployeeResponse> {

    SingleEmployeeCallback serviceProvidersCallback;

    public SingleEmployeeRH(SingleEmployeeCallback serviceProvidersCallback){
        this.serviceProvidersCallback = serviceProvidersCallback;
    }

    @Override
    protected void onSuccess(Response<SingleEmployeeResponse> response) {
        serviceProvidersCallback.onServiceProviderSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        serviceProvidersCallback.onServiceProvidersFailure(response);
    }
}