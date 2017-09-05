package com.gleydson.sendMail.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gleydson.sendMail.bean.Data;
import com.gleydson.sendMail.component.SendMailComponent;

@Controller
@RequestMapping("/service")
public class SendMailController {
	
	@Autowired
	public SendMailComponent sendMailComponent;
	
	@RequestMapping(value = "/sendMail", method = RequestMethod.POST, produces="application/json", consumes="application/json")
	public void sendMail(@RequestBody Data data) {
		sendMailComponent.sendMail(data);
	}
}
