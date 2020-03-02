package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.ServiceProviderHistory;

import java.io.Serializable;
import java.util.ArrayList;


public class ServiceProviderHistoryResponse extends BaseResponse implements Serializable {
    private ArrayList<ServiceProviderHistory> bookings;

    public ArrayList<ServiceProviderHistory> getData() {
        return bookings;
    }

    public void setData(ArrayList<ServiceProviderHistory> bookings) {
        this.bookings = bookings;
    }
}
