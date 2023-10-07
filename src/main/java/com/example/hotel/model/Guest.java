package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String last_name;
    private String first_name;
    private String birthplace;
    private String birthdate;
    private Long id_number;
    private String email;
    private String address;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Reservation> reservations = new ArrayList<>();




}
