package com.example.MyHotel.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private String roomPhoto;
    private List<BookingResponse> bookings;

    public RoomResponse(Long id, BigDecimal roomPrice, boolean isBooked) {
        this.id = id;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
    }

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, String roomPhoto, List<BookingResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.roomPhoto = roomPhoto;
        this.bookings = bookings;
    }
}