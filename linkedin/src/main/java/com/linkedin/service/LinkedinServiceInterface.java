package com.linkedin.service;

import java.util.List;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinServiceInterface {

	int createProfileService(LinkedinUser lu);

	LinkedinUser viewProfileService(LinkedinUser lu);

	List<LinkedinUser> viewAllProfileService();

	int editProfileService(LinkedinUser lu);

	int deleteProfileService(LinkedinUser lu);

	int loginProfileService(LinkedinUser lu);

	List<LinkedinUser> searchProfileService(LinkedinUser lu);


	


}
