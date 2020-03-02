package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Chat;

public class ChatResponse extends BaseResponse {

    public Chat getData() {
        return data;
    }

    public void setData(Chat data) {
        this.data = data;
    }

    private Chat data;
}
