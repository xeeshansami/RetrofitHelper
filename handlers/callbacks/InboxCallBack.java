package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.InboxResponse;

public interface InboxCallBack {
   void onInboxResponseSuccess(InboxResponse inboxResponse);
   void onInboxFailure(BaseResponse baseResponse);
}
