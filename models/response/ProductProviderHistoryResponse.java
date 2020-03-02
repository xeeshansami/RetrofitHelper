package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.ProductProviderHistory;

import java.io.Serializable;
import java.util.ArrayList;


public class ProductProviderHistoryResponse extends BaseResponse implements Serializable {
    private ArrayList<ProductProviderHistory> data;

    public ArrayList<ProductProviderHistory> getData() {
        return data;
    }

    public void setData(ArrayList<ProductProviderHistory> data) {
        this.data = data;
    }
}
