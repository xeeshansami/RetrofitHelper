package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.network.models.request.OrderProduct;

import java.io.Serializable;

public class OrderBuyDetailsResponse extends BaseResponse implements Serializable {

    private OrderProduct data;

    public OrderProduct getBooking() {
        return data;
    }

    public void setBooking(OrderProduct booking) {
        this.data = booking;
    }
}
