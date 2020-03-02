package com.gatakalfzzah.consumer.network.models.response;

import androidx.annotation.Nullable;

import com.gatakalfzzah.consumer.models.Employee;
import com.gatakalfzzah.consumer.models.EmployeeBill;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Booking implements Serializable {
    private Integer id;
    private Double latitude;
    private Double longitude;
    private String date_time;
    private String title;
    private Integer job_type;
    private String description;
    private Integer category_id;
    private Integer sub_category_id;
    private String created_at;
    private String updated_at;
    private String consumer_id;
    private String order_reference;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @SerializedName("media")
    @Expose
    private ArrayList<String> media = null;

    public ArrayList<String> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<String> media) {
        this.media = media;
    }

    public ArrayList<String> getVideo() {
        return video;
    }

    public void setVideo(ArrayList<String> video) {
        this.video = video;
    }

    @SerializedName("video")
    @Expose
    private ArrayList<String> video = null;

    public String getOrder_reference() {
        return order_reference;
    }

    public void setOrder_reference(String order_reference) {
        this.order_reference = order_reference;
    }

    //    private EmployeeSP employee;
//
//    public EmployeeSP getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(EmployeeSP employee) {
//        this.employee = employee;
//    }

    @SerializedName("employees")
    @Expose
    private ArrayList<Employee> employees;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    private EmployeeBill employee_bill;

    public EmployeeBill getEmployeeBill() {
        return employee_bill;
    }

    public void setEmployeeBill(EmployeeBill employeeBill) {
        this.employee_bill = employeeBill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getJob_type() {
        return job_type;
    }

    public void setJob_type(Integer job_type) {
        this.job_type = job_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getSub_category_id() {
        return sub_category_id;
    }

    public void setSub_category_id(Integer sub_category_id) {
        this.sub_category_id = sub_category_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getConsumer_id() {
        return consumer_id;
    }

    public void setConsumer_id(String consumer_id) {
        this.consumer_id = consumer_id;
    }


    public ArrayList<Employee> getService_providers() {
        return employees;
    }

    public void setService_providers(ArrayList<Employee> service_providers) {
        this.employees = service_providers;
    }
}
