package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ReservationStatus {
    @Id
    @Column(name="statusId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer statusId;
    @Column(name="status",unique =true, nullable=false,length =30)
    private Integer status;

}