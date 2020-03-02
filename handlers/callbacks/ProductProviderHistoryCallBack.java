package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ProductProviderHistoryResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderHistoryResponse;

public interface ProductProviderHistoryCallBack {
    void onBookingSuccess(ProductProviderHistoryResponse productProviderHistoryResponse);
    void onBookingFailure(BaseResponse baseResponse);
}
