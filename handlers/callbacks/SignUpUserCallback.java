package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;
import com.gatakalfzzah.consumer.network.models.response.SignUpResponse;

/**
 * Created by subhan on 11/27/18.
 */

public interface SignUpUserCallback {
    void onSignUpUserSuccess(SignUpResponse signInResponse);
    void onSignUpUserFailure(BaseResponse baseResponse);
}