package com.example.MyHotel.controller;

import com.example.MyHotel.model.Room;
import com.example.MyHotel.response.RoomResponse;
import com.example.MyHotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;
    public ResponseEntity<RoomResponse>
    addNewRoom(@RequestParam("roomPhoto") MultipartFile roomPhoto,
               @RequestParam("roomType")String roomType,
               @RequestParam("roomPrice")BigDecimal roomPrice){
        Room savedRoom = roomService.addNewRoom(roomPhoto, roomType, roomPrice)

    }
}
