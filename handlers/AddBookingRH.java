package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.AddBookingCallBack;
import com.gatakalfzzah.consumer.network.models.response.AddBookingResponse;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;

import retrofit2.Response;

public class AddBookingRH extends BaseRH<AddBookingResponse> {

    AddBookingCallBack bookingAddCallBack ;

    public AddBookingRH(AddBookingCallBack vendorCallBack) {
        this.bookingAddCallBack = vendorCallBack;
    }

    @Override
    protected void onSuccess(Response<AddBookingResponse> response) {
        this.bookingAddCallBack.onSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        this.bookingAddCallBack.onFailure(response);
    }
}

