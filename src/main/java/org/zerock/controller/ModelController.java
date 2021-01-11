package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/model/*")
@Log4j
public class ModelController {

	@RequestMapping("/ex1")
	public void method1(Model model) {
		log.info("method1");
		
//		request.setAttribute("abc", abc);
		model.addAttribute("name", "java");
		
	}
	
	@RequestMapping("/ex2")
	public void method2(@ModelAttribute("name") String name) {
		log.info("method2");
		
//		model.addAttribute("name", name);
		
		
	}
}









