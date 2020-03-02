package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.CreateVendorCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingVendorResponse;
import com.gatakalfzzah.consumer.network.models.response.VendorProductDetail;

import java.util.ArrayList;

import retrofit2.Response;

public class CreateVendorRH extends BaseRH<CreateBookingVendorResponse> {

    CreateVendorCallBack createVendorCallBack;

    public CreateVendorRH(CreateVendorCallBack vendorCallBack) {
        this.createVendorCallBack = vendorCallBack;
    }


    @Override
    protected void onSuccess(Response<CreateBookingVendorResponse> response) {
        createVendorCallBack.onBookingSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        createVendorCallBack.onBookingFailure(response);
    }
}

