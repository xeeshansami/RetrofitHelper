package com.gatakalfzzah.consumer.network.models.request;

import java.io.Serializable;

/**
 * Created by subhan on 1/13/19.
 */

public class ServiceProviderBookingRequest implements Serializable {
    private int booking_id;
    private int employee_id;
    private String bid_amount;
    private String bid_duration;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getBid_amount() {
        return bid_amount;
    }

    public void setBid_amount(String bid_amount) {
        this.bid_amount = bid_amount;
    }

    public String getBid_duration() {
        return bid_duration;
    }

    public void setBid_duration(String bid_duration) {
        this.bid_duration = bid_duration;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getService_provider_id() {
        return employee_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.employee_id = service_provider_id;
    }
}
