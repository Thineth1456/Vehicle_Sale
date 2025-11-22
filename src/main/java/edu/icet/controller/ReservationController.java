package edu.icet.controller;

import edu.icet.dto.Reservation;
import edu.icet.service.custom.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping
@RequiredArgsConstructor
public class ReservationController {
    final ReservationService reservationService;




    @GetMapping
    public List<Reservation> getAllReservations(){
        try {
            return reservationService.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
