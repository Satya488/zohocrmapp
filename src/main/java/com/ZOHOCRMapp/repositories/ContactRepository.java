package com.ZOHOCRMapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ZOHOCRMapp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
