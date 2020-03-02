package com.gatakalfzzah.consumer.network.models.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by subhan on 3/15/19.
 */

public class RatingRequest implements Serializable {
    @SerializedName("satisfaction_rating")
    @Expose
    private String satisfactionRating;
    @SerializedName("service_on_time_rating")
    @Expose
    private String serviceOnTimeRating;
    @SerializedName("service_on_budget_rating")
    @Expose
    private String serviceOnBudgetRating;
    @SerializedName("feedback")
    @Expose
    private String feedback;
    @SerializedName("service_provider_id")
    @Expose
    private String serviceProviderId;

    @SerializedName("employee_id")
    @Expose
    private String employee_id;

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    @SerializedName("booking_id")
    @Expose
    private String booking_id;

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    @SerializedName("rated_by")
    @Expose
    private Integer ratedBy;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getSatisfactionRating() {
        return satisfactionRating;
    }

    public void setSatisfactionRating(String satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }

    public String getServiceOnTimeRating() {
        return serviceOnTimeRating;
    }

    public void setServiceOnTimeRating(String serviceOnTimeRating) {
        this.serviceOnTimeRating = serviceOnTimeRating;
    }

    public String getServiceOnBudgetRating() {
        return serviceOnBudgetRating;
    }

    public void setServiceOnBudgetRating(String serviceOnBudgetRating) {
        this.serviceOnBudgetRating = serviceOnBudgetRating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public Integer getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(Integer ratedBy) {
        this.ratedBy = ratedBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}