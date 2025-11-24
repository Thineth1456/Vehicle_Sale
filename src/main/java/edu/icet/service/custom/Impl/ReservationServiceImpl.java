package edu.icet.service.custom.Impl;

import edu.icet.dto.Reservation;
import edu.icet.repository.custom.ReservationRepository;
import edu.icet.service.custom.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    final ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAll() throws SQLException {
        return reservationRepository.getAll();
    }

    @Override
    public boolean save(Reservation reservation) throws SQLException {
        return reservationRepository.save(reservation);
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return reservationRepository.delete(id);
    }

    @Override
    public boolean update(Reservation reservation) throws SQLException {
        return reservationRepository.update(reservation);
    }
}
