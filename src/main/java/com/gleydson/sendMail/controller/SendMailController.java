package com.gleydson.sendMail.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gleydson.sendMail.bean.Data;
import com.gleydson.sendMail.component.SendMailComponent;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/serviceMail")
public class SendMailController {
	
	@Autowired
	public SendMailComponent sendMailComponent;
	
	@PostMapping
	public void sendMail(@RequestBody Data data) {
		sendMailComponent.sendMail(data);
	}
}
