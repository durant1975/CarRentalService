package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarModel {
    @Id
    @Column(name="modelId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer modelId;


    @Column(name="modelName",unique =true, nullable=false,length =30)
    private String modelName;
}