package com.gatakalfzzah.consumer.network.handlers;

import android.widget.Toast;

import com.gatakalfzzah.consumer.network.handlers.callbacks.CreateBookingCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingServiceProviderResponse;

import retrofit2.Response;

//public class CreateBookingRH extends BaseRH<CreateBookingServiceProviderResponse> {
public class CreateBookingRH extends BaseRH<CreateBookingServiceProviderResponse> {

    CreateBookingCallback createBookingCallback;

    public CreateBookingRH(CreateBookingCallback serviceProvidersCallback) {
        this.createBookingCallback = serviceProvidersCallback;
    }


    @Override
    protected void onSuccess(Response<CreateBookingServiceProviderResponse> response) {
        createBookingCallback.onBookingSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        createBookingCallback.onBookingFailure(response);
    }
}
