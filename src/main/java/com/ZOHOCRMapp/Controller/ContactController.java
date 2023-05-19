package com.ZOHOCRMapp.Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ZOHOCRMapp.entities.Contact;
import com.ZOHOCRMapp.services.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
//http://localhost:8080/zohocrmapp/listAllContacts
	@RequestMapping("/listAllContacts")
public String listAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	
}
	
}
