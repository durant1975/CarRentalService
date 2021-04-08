package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarStatus {
    @Id
    @Column(name="carStatusId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer carStatusId;

    @Column(name="carStatus",unique =true, nullable=false,length =30)
    private String carStatus;
}