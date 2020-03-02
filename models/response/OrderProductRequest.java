package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.network.models.request.OrderProduct;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class OrderProductRequest extends BaseResponse implements Serializable {
    @SerializedName("data")
    @Expose
    private List<OrderProduct> data = null;


    public List<OrderProduct> getData() {
        return data;
    }

    public void setData(List<OrderProduct> data) {
        this.data = data;
    }
}
