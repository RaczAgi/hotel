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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class HotelController {
    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;

    @GetMapping("/reservation")
    public String getAllReservation(Model model) {
        model.addAttribute("reservation", reservationService.getAllReservation());
        return "reservation";
    }

    @GetMapping("/guests")
    public String listGuests(Model model){
        model.addAttribute("guests", guestService.getAllGuest());
        return "guests";
    }
    @GetMapping("/rooms")
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRoom());
        return "rooms";
    }
    @GetMapping("/add_guest")
    public String showGuestForm(Model model) {
        model.addAttribute("newGuest", new Guest());
        return "add_guest";}
    @PostMapping("/add_guest")
    public String addGuest(@ModelAttribute("newGuest") Guest newGuest) {
        guestService.addGuest(newGuest);
        return "redirect:/guests";}

    @GetMapping("/search_guest")
    public String searchGuest(){
        return "search_guest";
    }

    @PostMapping("/search_guest")
    public String searchGuest(@RequestParam("id") Long id) {
        guestService.searchGuest(id);
        return "redirect:/guests";
    }

    @GetMapping("/add_reservation")
    public String showReservationForm(Model model){
        model.addAttribute("newReservation", new Reservation());
        return "add_reservation";
    }
    @PostMapping("/add_reservation")
    public String addReservation(@ModelAttribute("newReservation") Reservation newReservation) {
        reservationService.addReservation(newReservation);
        return "redirect:/reservation";}


}
