package com.gatakalfzzah.consumer.network.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseSendChatResponse {

@SerializedName("success")
@Expose
private Boolean success;
@SerializedName("data")
@Expose
private ChatSendResponse data;

public Boolean getSuccess() {
return success;
}

public void setSuccess(Boolean success) {
this.success = success;
}

public ChatSendResponse getData() {
return data;
}

public void setData(ChatSendResponse data) {
this.data = data;
}

}