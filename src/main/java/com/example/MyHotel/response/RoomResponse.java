package com.example.MyHotel.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private String photo;
    private List<BookingResponse>bookings;