package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.R;
import com.gatakalfzzah.consumer.models.Rating;
import com.gatakalfzzah.consumer.network.models.request.RatingRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RatingResponse extends BaseResponse  {

    @SerializedName("rating")
    private RatingRequest rating;

    public RatingRequest getRating() {
        return rating;
    }

    public void setRating(RatingRequest rating) {
        this.rating = rating;
    }
}
