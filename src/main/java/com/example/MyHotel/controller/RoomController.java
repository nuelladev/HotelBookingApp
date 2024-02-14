package com.example.MyHotel.controller;

import com.example.MyHotel.model.Room;
import com.example.MyHotel.response.RoomResponse;
import com.example.MyHotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;
    @PostMapping("add/new-room")
    public ResponseEntity<RoomResponse> addNewRoom
            (@RequestParam("roomPhoto") MultipartFile roomPhoto,
               @RequestParam("roomType")String roomType,
               @RequestParam("roomPrice")BigDecimal roomPrice) throws SQLException, IOException {
        Room savedRoom = roomService.addNewRoom(roomPhoto, roomType, roomPrice);
        RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(), savedRoom.getRoomPrice());
        return ResponseEntity.ok(response);
    }
@GetMapping("/room/types")
  public List<String>getRoomTypes(){
   return roomService.getAllRoomTypes();
  }
}
