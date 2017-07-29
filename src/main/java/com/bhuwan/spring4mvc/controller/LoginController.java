/**
 * 
 */
package com.bhuwan.spring4mvc.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bhuwan
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("inside login method..............");

		return "login/login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		System.out.println("inside logut method..............");
		model.addAttribute("logout", true);
		return "login/login";
	}

	@RequestMapping(value = "/login-failed", method = RequestMethod.GET)
	public String loginFailed(Model model) {
		System.out.println("inside login failed method..............");
		model.addAttribute("error", true);

		return "login/login";
	}

	@RequestMapping(value = "/access-denied", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("login/access-denied");
		return model;

	}

}
