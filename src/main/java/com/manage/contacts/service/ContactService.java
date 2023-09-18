package com.manage.contacts.service;

import com.manage.contacts.entity.Address;
import com.manage.contacts.entity.Contact;
import com.manage.contacts.payload.ContactDto;

import java.util.List;

public interface ContactService {

     ContactDto createContact(ContactDto contactDto);


     List<ContactDto> getAllContact();

     List<Contact> getByzipcode(Integer zipCode);

     ContactDto updateconatct(ContactDto contactDto,Long cid);
}
