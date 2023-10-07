package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private Long id;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date start_date;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date end_date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    @JsonBackReference
    private Room room;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guest_id")
    @JsonBackReference
    private Guest guest;




}
