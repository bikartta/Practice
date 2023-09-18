package com.manage.contacts.payload;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ContactDto {
    private  Long id;

    private String fastName;
    private String middleName;

    private String lastName;
    private String dob;

    private String city;

    private Integer zipCode;

}
