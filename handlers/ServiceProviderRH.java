package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.CategoriesCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ServiceProvidersCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderResponse;

import retrofit2.Response;

/**
 * Created by subhan on 12/2/18.
 */

public class ServiceProviderRH extends BaseRH<ServiceProviderResponse> {

    ServiceProvidersCallback serviceProvidersCallback;

    public ServiceProviderRH(ServiceProvidersCallback serviceProvidersCallback){
        this.serviceProvidersCallback = serviceProvidersCallback;
    }

    @Override
    protected void onSuccess(Response<ServiceProviderResponse> response) {
        serviceProvidersCallback.onServiceProviderSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        serviceProvidersCallback.onServiceProvidersFailure(response);
    }
}