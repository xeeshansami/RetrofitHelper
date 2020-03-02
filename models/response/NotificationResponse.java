package com.gatakalfzzah.consumer.network.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.ArrayList;



public class NotificationResponse extends BaseResponse implements Serializable {
    @SerializedName("data")
    @Expose
    private ArrayList<Notif> data;

    public ArrayList<Notif> getData() {
        return data;
    }

    public void setData(ArrayList<Notif> data) {
        this.data = data;
    }
}
