package com.OnePercenterTravel.OPT;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/*
 * This file is for configuring your servlets in your Controller
 * The servlets allow you to view your JSP pages
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OptApplication.class);
	}

}
