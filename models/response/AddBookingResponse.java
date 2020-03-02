package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.BookingData;
import com.gatakalfzzah.consumer.models.Data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddBookingResponse extends BaseResponse implements Serializable {


    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}