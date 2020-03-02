package com.gatakalfzzah.consumer.network.models;

import java.io.Serializable;

/**
 * Created by subhan on 11/27/18.
 */

public class User implements Serializable{
    public String id;
    public String emailUser;
    public String username;
    public String last_name;
    public String number;
    public String updated_at;
    public String created_at;
    public String access_token;
    public String token_type;
    public String profile_image;

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String roleID;


/*private String cost_slab_first;
    private String cost_slab_second;
    private String cost_slab_third;*/

 /*   public String getCost_slab_first() {
        return cost_slab_first;
    }

    public void setCost_slab_first(String cost_slab_first) {
        this.cost_slab_first = cost_slab_first;
    }

    public String getCost_slab_second() {
        return cost_slab_second;
    }

    public void setCost_slab_second(String cost_slab_second) {
        this.cost_slab_second = cost_slab_second;
    }

    public String getCost_slab_third() {
        return cost_slab_third;
    }

    public void setCost_slab_third(String cost_slab_third) {
        this.cost_slab_third = cost_slab_third;
    }*/

    public Double latitude;
    public Double longitude;

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



    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

}
