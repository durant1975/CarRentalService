package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarBodyType {

    @Id
    @Column(name="carBodyTypeId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer carBodyTypeId;

    @Column(name="BodyType",unique =true, nullable=false,length =30)
    private String carBodyType;

}
