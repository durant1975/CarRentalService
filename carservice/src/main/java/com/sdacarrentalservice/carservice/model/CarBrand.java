package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarBrand {
    @Id
    @Column(name="brandId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer brandId;

    @Column(name="carBrandName",unique =true, nullable=false,length =100)
    private String carBrandName;

}
