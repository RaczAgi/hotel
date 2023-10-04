package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private Long id;
    private Long room_id;
    private Long guest_id;

    @ManyToMany
    @JoinColumn(name = "room_id")
    @JsonBackReference
    private List<Room> room;

    @ManyToMany
    @JoinColumn(name = "guest_id")
    @JsonBackReference
    private List<Guest> guests;


}
