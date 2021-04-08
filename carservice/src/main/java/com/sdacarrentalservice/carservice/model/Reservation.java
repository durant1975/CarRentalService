package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Reservation {


    @Id
    @Column(name="reservationId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer ReservationId;


    @ManyToOne
    @JoinColumn(name = "carId")
    private Car cars;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customers;


    @ManyToOne
    @JoinColumn(name = "branchId")
    private Branch branches;

    @Column(name="booking_date" , nullable=true)
    private String bookingDate;

    @Column(name="dateForm" , nullable=true)
    private String dateForm;

    @Column(name="dateTo",nullable=true)
    private String dateTo;

    @Column(name="totalCost",unique =true, nullable=true,length =100)
    private Float totalCost;



}
