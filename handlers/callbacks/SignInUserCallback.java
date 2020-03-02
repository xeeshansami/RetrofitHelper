package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;

/**
 * Created by subhan on 11/25/18.
 */

public interface SignInUserCallback {
    void onSignInUserSuccess(SignInResponse signInResponse);
    void onSignInUserFailure(BaseResponse baseResponse);
}
