package com.gatakalfzzah.consumer.network.handlers;

import com.gatakalfzzah.consumer.models.Rating;
import com.gatakalfzzah.consumer.network.handlers.callbacks.RatingCallBack;
import com.gatakalfzzah.consumer.network.models.request.RatingRequest;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.RatingResponse;

import retrofit2.Response;


public class RatingBaseResponseHR extends BaseRH<Rating> {
    RatingCallBack ratingCallBack;

    public RatingBaseResponseHR(RatingCallBack ratingCallBack) {
        this.ratingCallBack = ratingCallBack;
    }
    @Override
    protected void onSuccess(Response<Rating> response) {
        this.ratingCallBack.onRatingSuccessCallBack(response.body());
    }

    @Override
    protected void onFailure(BaseResponse response) {
        this.ratingCallBack.onRatingFailureCallBack(response);
    }
}
