package com.gatakalfzzah.consumer.network.models.request;

/**
 * Created by subhan on 11/25/18.
 */

public class SignInRequest {
    private String email;
    private String password;
    private String fcm_token;

    public SignInRequest(String email, String password, String fcm_token){
        this.email = email;
        this.password = password;
        this.fcm_token = fcm_token;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFcm_token() {
        return fcm_token;
    }

    public void setFcm_token(String fcm_token) {
        this.fcm_token = fcm_token;
    }
}
