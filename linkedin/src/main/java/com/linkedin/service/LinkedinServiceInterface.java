package com.linkedin.service;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinServiceInterface {

	int createProfileService(LinkedinUser lu);

	LinkedinUser viewProfileService(LinkedinUser lu);

}
