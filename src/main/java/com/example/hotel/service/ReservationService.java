package com.example.hotel.service;

import com.example.hotel.model.Guest;
import com.example.hotel.model.Reservation;
import com.example.hotel.repo.GuestRepo;
import com.example.hotel.repo.ReservationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {
    private ReservationRepo reservationRepo;

    public List<Reservation> getAllReservation() {
        return reservationRepo.findAll();
    }
}
