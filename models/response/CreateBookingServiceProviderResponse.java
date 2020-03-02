package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.CreateBooking;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CreateBookingServiceProviderResponse extends BaseResponse implements Serializable {
    @SerializedName("data")
    @Expose
    private Booking data;

    public Booking getBooking() {
        return data;
    }

    public void setBooking(Booking booking) {
        this.data = booking;
    }
}
