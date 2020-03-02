package com.gatakalfzzah.consumer.network.models.response;


import com.gatakalfzzah.consumer.models.ServiceProvider;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("service_provider_id")
    @Expose
    private Integer serviceProviderId;
    @SerializedName("vendor_id")
    @Expose
    private Object vendorId;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("cost_slab_first")
    @Expose
    private Integer costSlabFirst;
    @SerializedName("cost_slab_second")
    @Expose
    private Integer costSlabSecond;
    @SerializedName("cost_slab_third")
    @Expose
    private Integer costSlabThird;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("categories")
    @Expose
    private String categories;
    @SerializedName("sub_categories")
    @Expose
    private String subCategories;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("avg_rating")
    @Expose
    private Integer avgRating;
    @SerializedName("service_provider")
    @Expose
    private ServiceProvider serviceProvider;

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

    public Integer getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Integer serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public Object getVendorId() {
        return vendorId;
    }

    public void setVendorId(Object vendorId) {
        this.vendorId = vendorId;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getCostSlabFirst() {
        return costSlabFirst;
    }

    public void setCostSlabFirst(Integer costSlabFirst) {
        this.costSlabFirst = costSlabFirst;
    }

    public Integer getCostSlabSecond() {
        return costSlabSecond;
    }

    public void setCostSlabSecond(Integer costSlabSecond) {
        this.costSlabSecond = costSlabSecond;
    }

    public Integer getCostSlabThird() {
        return costSlabThird;
    }

    public void setCostSlabThird(Integer costSlabThird) {
        this.costSlabThird = costSlabThird;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(String subCategories) {
        this.subCategories = subCategories;
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

    public Integer getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Integer avgRating) {
        this.avgRating = avgRating;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

}