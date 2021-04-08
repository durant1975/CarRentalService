package com.sdacarrentalservice.carservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Company {
    @Id
    @Column(name = "companyId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;

    @Column(name = "companyName", unique = true, nullable = false, length = 200)
    private String companyName;

    @Column(name = "address", unique = true, nullable = false, length = 100)
    private String address;

    @Column(name = "owner", unique = true, nullable = false, length = 100)
    private String owner;

    @Column(name = "Website", unique = true, nullable = false, length = 100)
    private String website;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "phone", unique = true, nullable = false, length = 20)
    private String phone;

    @ToString.Exclude
    @OneToMany
    @JoinColumn (name= "branchId", referencedColumnName="CompanyId")
    private List<Branch> branches;
}
