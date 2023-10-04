package com.example.hotel.service;

import com.example.hotel.model.Guest;
import com.example.hotel.repo.GuestRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuestService {
    private GuestRepo guestRepo;

    public List<Guest> getAllGuest() {
        return guestRepo.findAll();
    }

}
