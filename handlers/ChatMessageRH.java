package com.gatakalfzzah.consumer.network.handlers;


import com.gatakalfzzah.consumer.network.handlers.callbacks.ChatReceiveCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatMessageResponse;

import retrofit2.Response;

public class ChatMessageRH extends BaseRH<ChatMessageResponse> {

    public ChatReceiveCallBack chatReceiveCallBack;

    public ChatMessageRH(ChatReceiveCallBack chatReceiveCallBack) {
        this.chatReceiveCallBack = chatReceiveCallBack;
    }

    @Override
    protected void onSuccess(Response<ChatMessageResponse> response) {
        chatReceiveCallBack.onChatMessageSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        chatReceiveCallBack.onChatMessageFailure(response);
    }
}
