/**
 * 
 */
package com.bhuwan.spring4mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhuwan.spring4mvc.model.Attende;

/**
 * @author bhuwan
 *
 */
@Controller
public class AttendeController {

	@RequestMapping(value = "/attende", method = RequestMethod.GET)
	public String getAttendePage(Model model) {
		Attende attende = new Attende();
		model.addAttribute("attende", attende);
		
		return "attende/attende";
	}

	@RequestMapping(value = "/attende", method = RequestMethod.POST)
	public String saveAttende(@Valid Attende attende, BindingResult result, Model model) {
		System.out.println(attende);
		if (result.hasErrors()) {
			return "attende/attende";
		}

		return "redirect:attende/list";
	}

	@RequestMapping(value = "/attende/list", method = RequestMethod.GET)
	public String allEvents() {
		System.out.println("redirecting to attendee list page");
		return "attende/list";
	}
}
