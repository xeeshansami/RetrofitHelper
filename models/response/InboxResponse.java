package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Inbox;

import java.util.List;

public class InboxResponse extends BaseResponse {

    private List<Inbox> data = null;

    public List<Inbox> getData() {
        return data;
    }

    public void setData(List<Inbox> data) {
        this.data = data;
    }
}


