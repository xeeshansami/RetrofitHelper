package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.ServiceProvider;

/**
 * Created by subhan on 1/12/19.
 */

public class SingleServiceProviderResponse extends BaseResponse{
    private ServiceProvider data;

    public ServiceProvider getData() {
        return data;
    }

    public void setData(ServiceProvider data) {
        this.data = data;
    }
}