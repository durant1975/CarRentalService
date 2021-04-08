package com.sdacarrentalservice.carservice.service;

import com.sdacarrentalservice.carservice.model.Reservation;
import com.sdacarrentalservice.carservice.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public void save(Reservation reservation) {

    }

    @Override
    public ReservationService updateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public void deleteReservation(Reservation reservation) {

    }

    @Override
    public void deleteReservationById(Long id) {

    }

    @Override
    public Reservation getReservation(Long id) {
        return null;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
