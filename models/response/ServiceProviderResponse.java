package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Employee;
import com.gatakalfzzah.consumer.models.ServiceProvider;

import java.util.ArrayList;

/**
 * Created by subhan on 12/2/18.
 */

public class ServiceProviderResponse extends BaseResponse{
    private ArrayList<Employee> employees;

    public ArrayList<Employee> getService_providers() {
        return employees;
    }

    public void setService_providers(ArrayList<Employee> service_providers) {
        this.employees = service_providers;
    }
}