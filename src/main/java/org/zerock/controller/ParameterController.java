package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/paramex/*")
@Log4j
public class ParameterController {
	
	@RequestMapping("/ex1")
	public void method1(HttpServletRequest request) {
		log.info(request);
		log.info(request.getParameter("name"));
		log.info("method1");
	}
}












