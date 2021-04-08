package com.sdacarrentalservice.carservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity( name="branch")
public class Branch {

    @Id
    @Column(name = "branchId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer branchId;

    @Column(name="branchName",unique =true, nullable=false,length =100)
    private Integer branchName;

    @Column(name="address",unique =true, nullable=false,length =100)
    private String address;

    @Column(name="phone",unique =true, nullable=false,length =100)
    private Integer phone;

    //link to table Employee
    @ToString.Exclude
    @OneToMany
    @JoinColumn (name= "employeeId", referencedColumnName="branchId")
    private List<Employee> employees;

}
