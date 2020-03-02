package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingVendorResponse;
import com.gatakalfzzah.consumer.network.models.response.VendorProductDetail;

import java.util.ArrayList;

public interface CreateVendorCallBack {

    void onBookingSuccess(CreateBookingVendorResponse bookingVendorResponse);
    void onBookingFailure(BaseResponse baseResponse);
}
