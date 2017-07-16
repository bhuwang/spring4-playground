package com.bhuwan.spring4mvc.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String>{

	@Override
	public void initialize(Phone phone) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null){
			return false;
		}
		return value.matches("[0-9()-]*");
	}

}
