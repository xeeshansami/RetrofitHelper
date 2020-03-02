package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.network.handlers.callbacks.InboxCallBack;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.InboxResponse;

import retrofit2.Response;

public class InboxRH extends BaseRH<InboxResponse> {

    InboxCallBack inboxCallBack;

    public InboxRH(InboxCallBack inboxCallBack) {
        this.inboxCallBack = inboxCallBack;
    }

    @Override
    protected void onSuccess(Response<InboxResponse> response) {
        inboxCallBack.onInboxResponseSuccess(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        inboxCallBack.onInboxFailure(response);
    }
}
