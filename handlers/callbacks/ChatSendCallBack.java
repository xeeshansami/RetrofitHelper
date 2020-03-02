package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatSendResponse;

public interface ChatSendCallBack {
    void onMessageSent(ChatSendResponse chatSendResponse);
    void onMessageFailure(BaseResponse baseResponse);
}
