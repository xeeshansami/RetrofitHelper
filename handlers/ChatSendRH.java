package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.ChatSendCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatSendResponse;

import retrofit2.Response;

public class ChatSendRH extends BaseRH<ChatSendResponse> {

    ChatSendCallBack chatSendCallBack;

    public ChatSendRH(ChatSendCallBack chatSendCallBack) {
        this.chatSendCallBack = chatSendCallBack;
    }


    @Override
    protected void onSuccess(Response<ChatSendResponse> response) {
        chatSendCallBack.onMessageSent(response.body().getData() );
    }

    @Override
    protected void onFailure(BaseResponse response) {
        chatSendCallBack.onMessageFailure(response);
    }
}

