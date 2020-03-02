package com.gatakalfzzah.consumer.network.models.request;

import java.io.File;



public class SignUpRequest {

    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String password_confirmation;
    private String number;
    private String app;
    private int role_id;
    private boolean social_flag;
    private String google_token;
    private String fb_token;
    private String twitter_token;
    private String address;
    private File profile_image;
    private double latitude, longitude;
    private String id_no;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public File getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(File profile_image) {
        this.profile_image = profile_image;
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

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public SignUpRequest(String first_name, String last_name, String email, String password, String number, String app, int role_id,
                         double latitude, double longitude, String address, String id_no, File image){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.password_confirmation = password;
        this.number = number;
        this.app = app;
        this.setRole_id(role_id);
        this.address=address;
        this.latitude=latitude;
        this.longitude=longitude;
        this.id_no=id_no;
        this.profile_image=image;
    }

    public SignUpRequest(String first_name, String last_name, String email, String app, int role_id){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.app = app;
        this.setRole_id(role_id);
        this.password = "";
        this.password_confirmation = "";
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public void setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public boolean isSocial_flag() {
        return social_flag;
    }

    public void setSocial_flag(boolean social_flag) {
        this.social_flag = social_flag;
    }

    public String getGoogle_token() {
        return google_token;
    }

    public void setGoogle_token(String google_token) {
        this.google_token = google_token;
    }

    public String getFb_token() {
        return fb_token;
    }

    public void setFb_token(String fb_token) {
        this.fb_token = fb_token;
    }

    public String getTwitter_token() {
        return twitter_token;
    }

    public void setTwitter_token(String twitter_token) {
        this.twitter_token = twitter_token;
    }
}
