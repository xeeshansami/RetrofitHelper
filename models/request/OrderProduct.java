package com.gatakalfzzah.consumer.network.models.request;

import com.gatakalfzzah.consumer.models.Order;
import com.gatakalfzzah.consumer.models.Product;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by subhan on 12/28/18.
 */

public class OrderProduct implements Serializable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order_reference")
    @Expose
    private String orderReference;
    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("consumer_id")
    @Expose
    private Integer consumerId;
    @SerializedName("payment_option")
    @Expose
    private Integer paymentOption;
    @SerializedName("order_status")
    @Expose
    private Integer orderStatus;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("job_due_at")
    @Expose
    private String jobDueAt;
    @SerializedName("purchases_id")
    @Expose
    private Integer purchasesId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("vendor_product_id")
    @Expose
    private Integer vendorProductId;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("billing_address")
    @Expose
    private String billingAddress;
    @SerializedName("billing_address_city")
    @Expose
    private String billingAddressCity;
    @SerializedName("billing_address_country")
    @Expose
    private String billingAddressCountry;
    @SerializedName("billing_address_zip")
    @Expose
    private String billingAddressZip;
    @SerializedName("shipping_address")
    @Expose
    private String shippingAddress;
    @SerializedName("shipping_address_city")
    @Expose
    private String shippingAddressCity;
    @SerializedName("shipping_address_country")
    @Expose
    private String shippingAddressCountry;
    @SerializedName("shipping_address_zip")
    @Expose
    private String shippingAddressZip;
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("longitude")
    @Expose
    private double longitude;

    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private String consumerRatingId;
    private String products;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(Integer paymentOption) {
        this.paymentOption = paymentOption;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getJobDueAt() {
        return jobDueAt;
    }

    public void setJobDueAt(String jobDueAt) {
        this.jobDueAt = jobDueAt;
    }

    public Integer getPurchasesId() {
        return purchasesId;
    }

    public void setPurchasesId(Integer purchasesId) {
        this.purchasesId = purchasesId;
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

    public Integer getVendorProductId() {
        return vendorProductId;
    }

    public void setVendorProductId(Integer vendorProductId) {
        this.vendorProductId = vendorProductId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    public String getBillingAddressZip() {
        return billingAddressZip;
    }

    public void setBillingAddressZip(String billingAddressZip) {
        this.billingAddressZip = billingAddressZip;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    public void setShippingAddressCountry(String shippingAddressCountry) {
        this.shippingAddressCountry = shippingAddressCountry;
    }

    public String getShippingAddressZip() {
        return shippingAddressZip;
    }

    public void setShippingAddressZip(String shippingAddressZip) {
        this.shippingAddressZip = shippingAddressZip;
    }

    public String getConsumerRatingId() {
        return consumerRatingId;
    }

    public void setConsumerRatingId(String consumerRatingId) {
        this.consumerRatingId = consumerRatingId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
