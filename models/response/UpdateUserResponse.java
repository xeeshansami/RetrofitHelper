package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.User;

public class UpdateUserResponse extends BaseResponse {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
