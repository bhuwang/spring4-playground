/**
 * 
 */
package com.bhuwan.spring4mvc.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.bhuwan.spring4mvc.view.Phone;

/**
 * @author bhuwan
 *
 */
public class Attende {

	@Size(min = 2, max = 50)
	private String name;

	@NotEmpty
	@Email
	private String emailAddress;

	@NotEmpty @Phone
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Attende [name=" + name + ", emailAddress=" + emailAddress + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
