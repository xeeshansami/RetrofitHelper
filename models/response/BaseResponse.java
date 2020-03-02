package com.gatakalfzzah.consumer.network.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class BaseResponse implements Serializable {
    String status = "";
    @SerializedName("success")
    @Expose
    boolean success;
    String message;
    String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public BaseResponse(){}

    public BaseResponse(String status, boolean success, String message ){
        this.status = status;
        this.success = success;
        this.message = message;

    }




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
