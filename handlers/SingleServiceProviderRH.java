package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.ServiceProvidersCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SingleServiceProviderCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleServiceProviderResponse;

import retrofit2.Response;



public class SingleServiceProviderRH extends BaseRH<SingleServiceProviderResponse> {

    SingleServiceProviderCallback serviceProvidersCallback;

    public SingleServiceProviderRH(SingleServiceProviderCallback serviceProvidersCallback){
        this.serviceProvidersCallback = serviceProvidersCallback;
    }

    @Override
    protected void onSuccess(Response<SingleServiceProviderResponse> response) {
        serviceProvidersCallback.onServiceProviderSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        serviceProvidersCallback.onServiceProvidersFailure(response);
    }
}