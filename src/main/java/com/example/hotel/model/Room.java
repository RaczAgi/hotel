package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Room {
    @Id
    private Long id;
    private Long capacity;
    private float price;
    private boolean jakuzzi;
    private boolean sauna;


    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Reservation> reservations;



}
