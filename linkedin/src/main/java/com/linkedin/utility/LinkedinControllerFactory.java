package com.linkedin.utility;

import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;

public class LinkedinControllerFactory {
	private LinkedinControllerFactory() {
	}
	public LinkedinControllerInterface createObject(String n) {
		if(n.equals("user")) {
			return new LinkedinController();
		}
		return null;
	}
}
