package com.gatakalfzzah.consumer.network.models.response;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by subhan on 12/25/18.
 */

public class CreateBookingVendorResponse extends BaseResponse implements Serializable {

    private ArrayList<VendorProductDetail> data;

    public ArrayList<VendorProductDetail> getData() {
        return data;
    }

    public void setData(ArrayList<VendorProductDetail> data) {
        this.data = data;
    }
}
