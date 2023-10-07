package com.example.hotel.service;

import com.example.hotel.model.Guest;
import com.example.hotel.repo.GuestRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GuestService {
    private final List<Guest> guests = new ArrayList<>();
    private GuestRepo guestRepo;

    public List<Guest> getAllGuest() {
        return guestRepo.findAll();
    }

    public Guest addGuest(Guest guest) {
        return guestRepo.save(guest);
    }

    public Guest getGuestById(Long id) {
        return guestRepo.findById(id).orElse(null);
    }
    public Guest searchGuest(Long id) {
        for (var actual : guests){
            if (id == actual.getId()){
                return actual;
            }
        } return null;
    }
}
