package com.gatakalfzzah.consumer.network.models.response;

public class BookingResponse extends BaseResponse {

    public BookingDetail getBookingDetail() {
        return bookingDetail;
    }

    public void setBookingDetail(BookingDetail bookingDetail) {
        this.bookingDetail = bookingDetail;
    }

    public BookingDetail bookingDetail;

}
