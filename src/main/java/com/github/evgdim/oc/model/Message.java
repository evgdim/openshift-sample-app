package com.github.evgdim.oc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	@XmlElement
	private String message;

	public Message(String message) {
		this.message = message;
	}

	public Message() {
		this.message = null;
	}

	public String getMessage() {
		return message;
	}
	
}
