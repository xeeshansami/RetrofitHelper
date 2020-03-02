package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.SignInUserCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SignUpUserCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;
import com.gatakalfzzah.consumer.network.models.response.SignUpResponse;

import retrofit2.Response;



public class SignUpUserRH extends BaseRH<SignUpResponse> {

    SignUpUserCallback signUpUserCallback;

    public SignUpUserRH(SignUpUserCallback signUpUserCallback){
        this.signUpUserCallback = signUpUserCallback;
    }

    @Override
    protected void onSuccess(Response<SignUpResponse> response) {
        signUpUserCallback.onSignUpUserSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        signUpUserCallback.onSignUpUserFailure(response);
    }
}