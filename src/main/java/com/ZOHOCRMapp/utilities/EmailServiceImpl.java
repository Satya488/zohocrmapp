package com.ZOHOCRMapp.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService{
	@Autowired
	private MailSender mailSender;

	@Override
	public void sendEmail(String To, String Subject, String Message) {
	SimpleMailMessage mail = new SimpleMailMessage();
	mail.setTo(To);
	mail.setSubject(Subject);
	mail.setText(Message);
		mailSender.send(mail);
	}

}
