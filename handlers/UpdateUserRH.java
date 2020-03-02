package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.UpdateUserCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.UpdateUserResponse;

import retrofit2.Response;

public class UpdateUserRH extends com.gatakalfzzah.consumer.network.handlers.BaseRH<UpdateUserResponse> {
    UpdateUserCallBack updateUserCallBack;

    public UpdateUserRH(UpdateUserCallBack updateUserCallBack) {
        this.updateUserCallBack = updateUserCallBack;
    }

    @Override
    protected void onSuccess(Response<UpdateUserResponse> response) {
        updateUserCallBack.OnUpdateUserSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        updateUserCallBack.OnUpdateFailure(response);
    }
}
