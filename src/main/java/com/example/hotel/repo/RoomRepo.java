package com.example.hotel.repo;

import com.example.hotel.model.Room;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {

}
