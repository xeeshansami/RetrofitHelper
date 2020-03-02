package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.handlers.UpdateUserRH;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;
import com.gatakalfzzah.consumer.network.models.response.UpdateUserResponse;

public interface UpdateUserCallBack {

    void OnUpdateUserSuccess(UpdateUserResponse updateUserResponse);
    void OnUpdateFailure(BaseResponse baseResponse);
}
