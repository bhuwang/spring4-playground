/**
 * 
 */
package com.bhuwan.spring4mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author bhuwan
 *
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println("Inside index/home page......");

		return "index";
	}

}
