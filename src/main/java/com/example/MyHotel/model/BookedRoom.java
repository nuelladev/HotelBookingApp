package com.example.MyHotel.model;

import java.time.LocalDate;
/**
 * @author Emmanuella Okafor
 */
public class BookedRoom {
    private long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int NumOfAdults;
    private int NumOfChildren;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;
    private Room room;

    public void calculateTotalNumberOfGuests(){
        this.totalNumOfGuests = this.NumOfAdults + this.NumOfChildren;
    }
    public void setNumOfAdults(int numOfAdults) {
        NumOfAdults = numOfAdults;
        calculateTotalNumberOfGuests();
    }
    public void setNumOfChildren(int numOfChildren) {
        NumOfChildren = numOfChildren;
        calculateTotalNumberOfGuests();
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
