package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.Member;

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
	
	@RequestMapping("/ex3")
	public void method3(@ModelAttribute("name")String name,
			@ModelAttribute("age") int age) {
		log.info("method3");
		log.info(name);
		log.info(age);
	}
	
	@RequestMapping("/ex4")
	public void method4(@ModelAttribute("member") Member member) {
		log.info("method4");
		log.info(member);
		
//		model.addAttribute("member", member);
		
	}
	
	@RequestMapping("/ex5")
	// model attribute의 이름은 소문자로 바꾼 type 명으로 결정됨
	public void method5(@ModelAttribute Member member) {
		log.info("method5");
		log.info(member);
		
	}
	
	@RequestMapping("/ex6")
	// model attribute의 이름은 소문자로 바꾼 type 명으로 결정됨
	public String method6(Member member) {
		log.info("method6");
		log.info(member);
		
		return "model/ex4";
	}
}









