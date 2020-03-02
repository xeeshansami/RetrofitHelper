package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.NotificationResponse;

/**
 * Created by subhan on 5/6/19.
 */

public interface NotificationCallback {
    void onGetNotificationSuccess(NotificationResponse jobResponse);
    void onGetNotificationFailure(BaseResponse baseResponse);
}
