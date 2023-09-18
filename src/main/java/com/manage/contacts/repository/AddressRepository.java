package com.manage.contacts.repository;

import com.manage.contacts.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

    public interface AddressRepository extends JpaRepository<Address,Long> {

}
