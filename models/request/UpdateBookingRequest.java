package com.gatakalfzzah.consumer.network.models.request;

import java.io.Serializable;

/**
 * Created by subhan on 1/14/19.
 */

public class UpdateBookingRequest implements Serializable {
    private int booking_id;
    private String date_time;
    private int employee_id;
    private String description;
    private String title;
    private int job_type;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getService_provider_id() {
        return employee_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.employee_id = service_provider_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getJob_type() {
        return job_type;
    }

    public void setJob_type(int job_type) {
        this.job_type = job_type;
    }
}
