package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.SignInUserCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;

import retrofit2.Response;


public class SignInUserRH extends BaseRH<SignInResponse> {

    SignInUserCallback signInUserCallback;

    public SignInUserRH(SignInUserCallback signInUserCallback){
        this.signInUserCallback = signInUserCallback;
    }

    @Override
    protected void onSuccess(Response<SignInResponse> response) {
        signInUserCallback.onSignInUserSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        signInUserCallback.onSignInUserFailure(response);
    }
}
