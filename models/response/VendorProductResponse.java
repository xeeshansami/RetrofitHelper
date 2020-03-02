package com.gatakalfzzah.consumer.network.models.response;

import java.util.ArrayList;

/**
 * Created by subhan on 12/28/18.
 */

public class VendorProductResponse extends BaseResponse {

    private ArrayList<VendorProduct> data;

    public ArrayList<VendorProduct> getData() {
        return data;
    }

    public void setData(ArrayList<VendorProduct> data) {
        this.data = data;
    }
}
