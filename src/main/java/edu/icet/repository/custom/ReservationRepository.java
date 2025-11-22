package edu.icet.repository.custom;

import edu.icet.dto.Reservation;
import edu.icet.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReservationRepository extends CrudRepository<Reservation> {
}
