package com.github.evgdim.oc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.evgdim.oc.model.Message;

@RestController
public class HomeController {
	@GetMapping//(produces = { MediaType.APPLICATION_XML_VALUE })
	public Message index() {
		return new Message("OK");
	}
}
