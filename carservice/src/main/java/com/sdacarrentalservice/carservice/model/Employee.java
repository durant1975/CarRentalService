package com.sdacarrentalservice.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @Column(name="employeeId",unique =true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer employeeId;


    @ManyToOne
    @JoinColumn( name ="branchId" )
    private Branch branches;


    @Column(name="firstName",unique =true, nullable=false,length =100)
    private String firstName;


    @Column(name="surname",unique =true, nullable=false,length =100)
    private String surname;


    @Column(name="position",unique =true, nullable=false,length =20)
    private String position;

}