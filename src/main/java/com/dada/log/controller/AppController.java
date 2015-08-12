package com.dada.log.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@RequestMapping(value = "/app" , method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		
		amqpTemplate.convertAndSend("queue_one_key" , "Hello");
		return "ok";
	}
}
