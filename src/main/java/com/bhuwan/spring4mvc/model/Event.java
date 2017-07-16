/**
 * 
 */
package com.bhuwan.spring4mvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author bhuwan
 *
 */
public class Event {

	@NotNull
	@Size(min=50)
	private String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@Override
	public String toString() {
		return "Event [eventName=" + eventName + "]";
	}

}
