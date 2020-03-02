package com.gatakalfzzah.consumer.network.handlers.callbacks;


import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatMessageResponse;

public interface ChatReceiveCallBack {

   void onChatMessageSuccess(ChatMessageResponse chatMessageResponse);
   void onChatMessageFailure(BaseResponse baseResponse);
}
