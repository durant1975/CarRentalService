package com.sdacarrentalservice.carservice.service;

import com.sdacarrentalservice.carservice.model.Reservation;

import java.util.List;

public interface ReservationService {

    void save(Reservation reservation );
    ReservationService updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    void deleteReservationById(Long id);
    Reservation getReservation(Long id);

    List<Reservation> getAllReservations();
}

