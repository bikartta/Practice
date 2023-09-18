package com.manage.contacts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cId")
    private  Long cId;
    @Column(name = "fastName")
    private String fastName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dob")
    private String dob;

    @OneToOne(cascade=CascadeType.ALL,fetch =FetchType.EAGER )
    @JoinColumn(name="address_Id")
    private Address address;
}
