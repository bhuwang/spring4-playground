/**
 * 
 */
package com.bhuwan.spring4mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bhuwan.spring4mvc.model.Event;

/**
 * @author bhuwan
 *
 */
@RestController
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public ModelAndView renderEventPage(Model model) {
		Event event = new Event();
		event.setEventName("My Default Event");
		model.addAttribute("event", event);
		System.out.println("Event form page");

		return new ModelAndView("event/event");
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public ModelAndView saveEvent(@Valid @ModelAttribute(value = "event") Event event, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
		}
		System.out.println(event);
		return new ModelAndView("redirect:event/list");
	}

	@RequestMapping(value = "/event/list", method = RequestMethod.GET)
	public ModelAndView allEvents() {
		System.out.println("redirecting to list page");
		return new ModelAndView("event/list");
	}
	
	@RequestMapping(value = "/event/all", method = RequestMethod.GET)
	public List<Event> Events() {
		List<Event> events = new ArrayList<>();
		
		Event event1 = new Event();
		event1.setEventName("My Event 1");
		events.add(event1);
		
		Event event2 = new Event();
		event2.setEventName("My Event 2");
		events.add(event2);
		
		Event event3 = new Event();
		event3.setEventName("My Event 2");
		events.add(event3);

		return events;
	}
}
