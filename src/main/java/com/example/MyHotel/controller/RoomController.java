package com.example.MyHotel.controller;

import com.example.MyHotel.response.RoomResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public class RoomController {
    public ResponseEntity<RoomResponse>
    addNewRoom(@RequestParam("photo") MultipartFile roomPhoto,
               @RequestParam("photo")String roomType,
               @RequestParam("photo")BigDecimal roomPrice){

    }
}
