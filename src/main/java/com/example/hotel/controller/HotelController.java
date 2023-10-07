package com.example.hotel.controller;

import com.example.hotel.model.Guest;
import com.example.hotel.model.Reservation;
import com.example.hotel.model.Room;
import com.example.hotel.service.GuestService;
import com.example.hotel.service.ReservationService;
import com.example.hotel.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class HotelController {
    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public List<Reservation> getAllReservation() {
        return reservationService.getAllReservation();
    }


    @GetMapping("/guests")
    public String listGuests(Model model){
        model.addAttribute("guests", guestService.getAllGuest());
        return "guests";
    }

    @GetMapping("/add_guest")
    public String showGuestForm(Model model) {
        model.addAttribute("newGuest", new Guest());
        return "add_guest";}
    @PostMapping("/add_guest")
    public String addBook(@ModelAttribute("newGuest") Guest newGuest) {
        guestService.addGuest(newGuest);
        return "redirect:/guests";}

/*
    @GetMapping("/reservation")
    public String showNewReservationForm(Model model){
        model.addAttribute("newReservation", new Reservation());
        return "reservation";
    }
    @PostMapping("/reservation")
    public String addReservation(@ModelAttribute("newReservation") Reservation newReservation) {
        reservationService.addReservation(newReservation);
        return "redirect:/guests";}

*/

}
