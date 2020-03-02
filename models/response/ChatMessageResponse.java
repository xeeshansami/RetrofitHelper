package com.gatakalfzzah.consumer.network.models.response;

import com.stfalcon.chatkit.model.ChatMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMessageResponse extends BaseResponse {

private List<ChatMessage> data = null;

public List<ChatMessage> getData() {
return data;
}

public void setData(List<ChatMessage> data) {
this.data = data;
}



}