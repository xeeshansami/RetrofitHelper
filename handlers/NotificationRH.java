package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.NotificationCallback;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.NotificationResponse;

import retrofit2.Response;

/**
 * Created by subhan on 5/6/19.
 */

public class NotificationRH extends BaseRH<NotificationResponse> {

    NotificationCallback notificationCallback;

    public NotificationRH(NotificationCallback notificationCallback){
        this.notificationCallback = notificationCallback;
    }


    @Override
    protected void onSuccess(Response<NotificationResponse> response) {
        this.notificationCallback.onGetNotificationSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        this.notificationCallback.onGetNotificationFailure(response);
    }
}