package com.ZOHOCRMapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ZOHOCRMapp.entities.Billing;
import com.ZOHOCRMapp.entities.Contact;
import com.ZOHOCRMapp.services.BillingService;
import com.ZOHOCRMapp.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
public String viewBillingPage(@RequestParam("id")long id, Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact",contact);
	return "generate_bill";
}
	@PostMapping("/saveBill")
	public String saveBill(@ModelAttribute("Billing") Billing billing,Model model) {
		billingService.saveOneBill(billing);
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
}
