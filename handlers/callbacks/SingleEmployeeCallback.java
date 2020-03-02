package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleEmployeeResponse;

/**
 * Created by subhan on 3/12/19.
 */

public interface SingleEmployeeCallback {
    void onServiceProviderSuccess(SingleEmployeeResponse singleServiceProviderResponse);
    void onServiceProvidersFailure(BaseResponse baseResponse);
}
