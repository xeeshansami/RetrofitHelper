package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;

/**
 * Created by subhan on 12/25/18.
 */

public interface CheckEmailCallback {
    void onSuccess(BaseResponse response);
    void onFailure(BaseResponse response);}
