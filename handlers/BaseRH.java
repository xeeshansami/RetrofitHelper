package com.gatakalfzzah.consumer.network.handlers;

import android.content.Intent;

import com.gatakalfzzah.consumer.ConsumerApplication;
import com.gatakalfzzah.consumer.activities.LoginActivity;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.vend.utils.ToastUtil;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by subhan on 11/25/18.
 */

public abstract class BaseRH<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        Boolean isSuccess = response.isSuccessful();

        if (isSuccess != null && isSuccess) {
            onSuccess(response);
        }
        else if (response.code() == 201){
            onSuccess(response);
        }

        else {
            try {
                if (response.errorBody() != null) {
                    if (response.code() == 401){
                        onFailure(new BaseResponse("-1", false, "Token has been expired, Login again"));
                        ConsumerApplication.getCurrentActivity().gotoActivity(LoginActivity.class, true);
                    }
                    else {
                        String errorResponse = response.errorBody().string();
                        JSONObject json = new JSONObject(errorResponse);
                        onFailure(new BaseResponse("-1", false, json.has("error")?
                                json.optString("error"): json.optString("message")));
                    }

                } else {
                    onFailure(call, null);
                }
            } catch (Exception e) {
                onFailure(call, null);
            }
        }

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onFailure(new BaseResponse("-1", false, "Something unexpected happened, please try again later."));
    }

    protected abstract void onSuccess(Response<T> response);
    protected abstract void onFailure(BaseResponse response);

}