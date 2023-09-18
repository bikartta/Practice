package com.manage.contacts.controller;

import com.manage.contacts.entity.Contact;
import com.manage.contacts.payload.ContactDto;
import com.manage.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact/api")
public class ContactController {
    @Autowired
   private ContactService contactService;
    @PostMapping("/save")
    public ResponseEntity<ContactDto>saveContact(@RequestBody ContactDto contactDto){
        ContactDto contact = contactService.createContact(contactDto);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);

    }
    @GetMapping("/get")
    public List<ContactDto> getAllContacts(){
      return  contactService.getAllContact();

    }
    @GetMapping("/getByZip/{zipCode}")
    public List<Contact> getByzip(@PathVariable Integer zipCode){
        return contactService.getByzipcode(zipCode);
    }





}
