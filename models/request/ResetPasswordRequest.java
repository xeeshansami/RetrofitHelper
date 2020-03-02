package com.gatakalfzzah.consumer.network.models.request;



public class ResetPasswordRequest {
    private String email;
    private String role_id;

    public ResetPasswordRequest(String email, String role_id) {
        this.email = email;
        this.role_id = role_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public ResetPasswordRequest(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


