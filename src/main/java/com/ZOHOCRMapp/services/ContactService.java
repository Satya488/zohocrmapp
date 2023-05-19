package com.ZOHOCRMapp.services;

import java.util.List;

import com.ZOHOCRMapp.entities.Contact;

public interface ContactService {
public void saveContact(Contact contact);

public List<Contact> getAllContacts();

public Contact getContactById(long id);
}
