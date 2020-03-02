package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleServiceProviderResponse;

/**
 * Created by subhan on 1/12/19.
 */

public interface SingleServiceProviderCallback {
    void onServiceProviderSuccess(SingleServiceProviderResponse singleServiceProviderResponse);
    void onServiceProvidersFailure(BaseResponse baseResponse);
}
