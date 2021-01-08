package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@RequestMapping("/ex2")
	public void method2(@RequestParam("name") String n) {
		log.info("method2");
		log.info(n);
	}
	
	@RequestMapping("/ex3")
	public void method3(@RequestParam String name) {
		log.info("method3");
		log.info(name);
	}
	
	@RequestMapping("/ex4")
	public void method4(String name) {
		log.info("method4");
		log.info(name);
	}
	
	
}















