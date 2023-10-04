package com.example.hotel.controller;

import com.example.hotel.model.Guest;
import com.example.hotel.model.Reservation;
import com.example.hotel.model.Room;
import com.example.hotel.service.GuestService;
import com.example.hotel.service.ReservationService;
import com.example.hotel.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HotelController {
    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;

    @GetMapping("/guests")
    public List<Guest> getAllGuest(){
        return guestService.getAllGuest();
    }

    @GetMapping("/rooms")
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }
    @GetMapping("/reservations")
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservation();
    }
}
