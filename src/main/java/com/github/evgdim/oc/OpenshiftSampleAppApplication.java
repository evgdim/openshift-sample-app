package com.github.evgdim.oc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OpenshiftSampleAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftSampleAppApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(OpenshiftSampleAppApplication.class);
	}
}
