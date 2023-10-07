package com.example.hotel.service;

import com.example.hotel.model.Guest;
import com.example.hotel.model.Room;
import com.example.hotel.repo.GuestRepo;
import com.example.hotel.repo.RoomRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {

    private RoomRepo roomRepo;

    public List<Room> getAllRoom() {
        return roomRepo.findAll();
    }


}
