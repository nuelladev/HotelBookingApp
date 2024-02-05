package com.example.MyHotel.service;

import com.example.MyHotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface RoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice);
}
