package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Customer {
    @Id
    @Column(unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer customerId;

    private String userName;


    @Column(name="password",unique =true, nullable=false,length =100)
    private String password;

    @Column(name="surname",unique =true, nullable=false,length =100)
    private String surname;

    @Column(name="email",unique =true, nullable=false,length =20)
    private String email;

    @Column(name="phone",unique =true, nullable=false,length =20)
    private String phone;

    @Column(name="address",unique =true, nullable=false,length =100)
    private String address;


}