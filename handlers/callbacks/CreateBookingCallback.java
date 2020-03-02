package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingServiceProviderResponse;

public interface CreateBookingCallback {
    void onBookingSuccess(CreateBookingServiceProviderResponse categoriesResponse);
    void onBookingFailure(BaseResponse baseResponse);
}
