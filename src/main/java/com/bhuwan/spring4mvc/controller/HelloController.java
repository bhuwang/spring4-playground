/**
 * 
 */
package com.bhuwan.spring4mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bhuwan
 *
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/greet")
	public String greet(Model model) {
		System.out.println("I am greeting......");
		
		model.addAttribute("greeting", "Welcome to Spring Web MVC 4");
		return "hello";
	}
}
