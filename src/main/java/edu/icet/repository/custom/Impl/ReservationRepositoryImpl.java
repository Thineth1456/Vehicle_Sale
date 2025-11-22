package edu.icet.repository.custom.Impl;

import edu.icet.dto.Reservation;
import edu.icet.repository.custom.ReservationRepository;
import edu.icet.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepositoryImpl implements ReservationRepository {
    @Override
    public boolean save(Reservation reservation) throws SQLException {
        return CrudUtil.execute("INSERT INTO reservation VALUES(?,?,?,?)",reservation.getReservationId(),reservation.getDate(),reservation.getTime(),reservation.getCustomerId());
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return CrudUtil.execute("DELETE FROM reservation WHERE id = ?",id);
    }

    @Override
    public List<Reservation> getAll() throws SQLException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM reservation");
        ArrayList<Reservation> reservationList = new ArrayList<>();
        while (resultSet.next()){
            reservationList.add(new Reservation(resultSet.getString(1),resultSet.getDate(2),resultSet.getTime(3),resultSet.getString(4)));
        }

        return reservationList;
    }
}
