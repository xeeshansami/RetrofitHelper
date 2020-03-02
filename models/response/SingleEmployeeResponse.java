package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.Employee;

/**
 * Created by subhan on 3/12/19.
 */


public class SingleEmployeeResponse extends BaseResponse{
    private Employee employee;
    String averageRating;

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getData() {
        return employee;
    }

    public void setData(Employee data) {
        this.employee = data;
    }
}