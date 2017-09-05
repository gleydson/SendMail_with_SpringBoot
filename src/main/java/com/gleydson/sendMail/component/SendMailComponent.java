package com.gleydson.sendMail.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.gleydson.sendMail.bean.Data;

@Component
public class SendMailComponent {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(Data data) {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo("gleydsonsr@gmail.com");
		email.setSubject(data.getSubject());
		email.setText("Email de: " + data.getFrom() + "\n\n" + data.getMessage());
		mailSender.send(email);
	}
}
