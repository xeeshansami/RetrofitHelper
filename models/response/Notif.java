package com.gatakalfzzah.consumer.network.models.response;

import androidx.annotation.Nullable;

import com.gatakalfzzah.consumer.models.EmployeeBill;
import com.gatakalfzzah.consumer.models.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Notif implements Serializable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("booking_id")
    @Expose
    private Integer bookingId;
    @SerializedName("booking_detail_id")
    @Expose
    private Object bookingDetailId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title_en")
    @Expose
    private String titleEn;
    @SerializedName("title_fr")
    @Expose
    private String titleFr;
    @SerializedName("title_ar")
    @Expose
    private String titleAr;
    @SerializedName("title_ur")
    @Expose
    private String titleUr;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("booking")
    @Expose
    public Booking booking;
    @SerializedName("booking_detail")
    @Expose
    public Booking bookingDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Object getBookingDetailId() {
        return bookingDetailId;
    }

    public void setBookingDetailId(Object bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    public String getTitleAr() {
        return titleAr;
    }

    public void setTitleAr(String titleAr) {
        this.titleAr = titleAr;
    }

    public String getTitleUr() {
        return titleUr;
    }

    public void setTitleUr(String titleUr) {
        this.titleUr = titleUr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Booking getBookingDetail() {
        return bookingDetail;
    }

    public void setBookingDetail(Booking bookingDetail) {
        this.bookingDetail = bookingDetail;
    }
}
