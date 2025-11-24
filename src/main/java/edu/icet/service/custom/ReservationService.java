package edu.icet.service.custom;

import edu.icet.dto.Reservation;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public interface ReservationService {
    List<Reservation> getAll() throws SQLException;
    boolean save(Reservation reservation) throws SQLException;
    boolean delete(String id) throws SQLException;

    boolean update(Reservation reservation) throws SQLException;
}
