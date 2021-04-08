package com.sdacarrentalservice.carservice.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity

public class Payment {
    @Id
    @Column(name="paymentId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer paymentId;

    @ManyToOne
    @JoinColumn(name ="reservationId" )
    private Reservation reservation;


    @Column(name="paymentDate")
    private Date paymentDate;
    private Float amount;
}