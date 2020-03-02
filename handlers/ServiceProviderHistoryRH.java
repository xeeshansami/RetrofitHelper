package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.models.ServiceProviderHistory;
import com.gatakalfzzah.consumer.network.handlers.callbacks.CreateVendorCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ServiceProviderHistoryCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingVendorResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderHistoryResponse;

import java.util.ArrayList;

import retrofit2.Response;

public class ServiceProviderHistoryRH extends BaseRH<ServiceProviderHistoryResponse> {

    ServiceProviderHistoryCallBack serviceProviderHistoryCallBack;

    public ServiceProviderHistoryRH(ServiceProviderHistoryCallBack serviceProviderHistoryCallBack) {
        this.serviceProviderHistoryCallBack = serviceProviderHistoryCallBack;
    }



    @Override
    protected void onSuccess(Response<ServiceProviderHistoryResponse> response) {
        serviceProviderHistoryCallBack.onBookingSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        serviceProviderHistoryCallBack.onBookingFailure(response);
    }
}