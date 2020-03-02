package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.models.Rating;
import com.gatakalfzzah.consumer.network.models.request.RatingRequest;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.RatingResponse;

public interface RatingCallBack {
    void onRatingSuccessCallBack(Rating ratingRequest);
    void onRatingFailureCallBack(BaseResponse baseResponse);
}
