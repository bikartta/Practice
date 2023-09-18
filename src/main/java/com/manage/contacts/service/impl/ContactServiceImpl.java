package com.manage.contacts.service.impl;

import com.manage.contacts.entity.Address;
import com.manage.contacts.entity.Contact;
import com.manage.contacts.payload.ContactDto;
import com.manage.contacts.repository.ContactRepository;
import com.manage.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public ContactDto createContact(ContactDto contactDto) {
        Contact contact = MapToEntity(contactDto);
        Contact contact1 = contactRepository.save(contact);
        ContactDto contactDto1 = MapToDto(contact1);
        return contactDto1;
    }

    @Override
    public List<ContactDto> getAllContact() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts.stream().map(contact -> MapToDto(contact)).collect(Collectors.toList());


    }


    @Override
    public List<Contact> getByzipcode(Integer zipCode) {
        List<Contact> contacts = contactRepository.findAll();
        List<Contact> filterContact = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getAddress().getZipCode().toString().equals(zipCode.toString())) {
                filterContact.add(contact);

            }
        }

        return filterContact;

    }

    @Override
    public ContactDto updateconatct(ContactDto contactDto, Long cid) {
        Optional<Contact> byId = contactRepository.findById(cid);
        if(byId.isPresent()){
            Contact contact = byId.get();
              contact.setFastName(contactDto.getFastName());
        }




        return null;
}


    private ContactDto MapToDto(Contact contact1) {
        ContactDto contactDto=new ContactDto();
        contactDto.setId(contact1.getCId());
        contactDto.setFastName(contact1.getFastName());
        contactDto.setMiddleName(contact1.getMiddleName());
        contactDto.setLastName(contact1.getLastName());
        contactDto.setDob(contact1.getDob());
        contactDto.setCity(contact1.getAddress().getCity());
        contactDto.setZipCode(contact1.getAddress().getZipCode());
        return contactDto;
    }

    private Contact MapToEntity(ContactDto contactDto) {
        Address address=new Address();
        address.setCity(contactDto.getCity());
        address.setZipCode(contactDto.getZipCode());
        Contact contact=new Contact();
        contact.setCId(contactDto.getId());
        contact.setFastName(contactDto.getFastName());
        contact.setMiddleName(contactDto.getMiddleName());
        contact.setLastName(contactDto.getLastName());
        contact.setDob(contactDto.getDob());
        contact.setAddress(address);

        return contact;
    }


}
