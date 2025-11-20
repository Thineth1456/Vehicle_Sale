package edu.icet.dto;

import lombok.Data;

import java.sql.Time;

public class Reservation {
    private String reservationId;
    private Data data;
    private Time time;
    private String customerId;
}
