package com.management.LifeMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.management.LifeMS.dto.LifeDTO;
import com.management.LifeMS.service.LifeService;
@RestController
@EnableAutoConfiguration
@CrossOrigin

public class LifeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	LifeService lifeservice;

	// Fetches all motor details based on phonenumber
	@GetMapping(value = "/life/{phonenumber}/lifedetails",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LifeDTO> getAlllifedetails(@PathVariable("phonenumber") String phonenumber) {
		return lifeservice.getAlllifedetails(phonenumber);
	}
	// To get a motor details based on policynumber
	@GetMapping(value = "/life/{policynumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LifeDTO getlifedetails(@PathVariable("policynumber") String policynumber) {
		return lifeservice.getSpecificlife(policynumber);
		
	}


}
