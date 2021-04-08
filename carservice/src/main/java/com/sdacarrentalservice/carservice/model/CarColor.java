package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //
public class CarColor {
    @Id
    @Column(name="colorId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer colorId;


    @Column(name="carColor",unique =true, nullable=false,length =30)
    private String carColor;

}