package com.manage.contacts.repository;

import com.manage.contacts.entity.Address;
import com.manage.contacts.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Long> {


}
