package com.sdacarrentalservice.carservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Verified and double  Checked
@Data
@Entity
public class Car {

    @Id
    @Column(name = "carId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @ManyToOne
    @JoinColumn(name = "branchId")
    private Branch branches;

    @Column(name = "carCode", unique = true, nullable = false, length = 100)
    private Integer carCode;

    @ManyToOne
    @JoinColumn(name = "brandId")
    private CarBrand carBrand;

    @ManyToOne
    @JoinColumn(name = "modelId")
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "carBodyTypeId")
    private CarBodyType carBodyType;


    @ManyToOne
    @JoinColumn(name = "colorId")
    private CarColor carColor;

    @Column(name = "year")
    private Integer year;

    @Column(name = "per_date_rate")
    private Float per_date_rate;

    @ManyToOne
    @JoinColumn(name = "carStatusId")
    private CarStatus status;


    @ToString.Exclude
    @OneToMany
    @JoinColumn(name = "ReservationId", referencedColumnName = "carId")
    private List<Reservation> reservation;



}
