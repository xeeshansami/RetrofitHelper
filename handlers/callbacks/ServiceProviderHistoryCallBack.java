package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.models.ServiceProviderHistory;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingVendorResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderHistoryResponse;

import java.util.ArrayList;

public interface ServiceProviderHistoryCallBack {
    void onBookingSuccess(ServiceProviderHistoryResponse serviceProviderHistory);
    void onBookingFailure(BaseResponse baseResponse);
}
