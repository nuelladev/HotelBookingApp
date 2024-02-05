package com.example.MyHotel.service;

import com.example.MyHotel.model.Room;
import com.example.MyHotel.repository.RoomRepository;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;
    @Override
    public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice throws SQLException, IOException) {
        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
        if(!file.isEmpty()){
            byte[] photoBytes = file.getBytes();
            Blob photoBlob = new SerialBlob(photoBytes);
            room.setRoomPhoto(photoBlob);
        }
        return room
    }
}
