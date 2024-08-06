package com.linkedin.DAO;

import java.util.List;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinDAOInterface {

	int createProfileDAO(LinkedinUser lu);

	LinkedinUser viewProfileDAO(LinkedinUser lu);

	List<LinkedinUser> viewAllProfileDAO();
	
	int loginProfileDAO(LinkedinUser lu);

	List<LinkedinUser> searchProfileDAO(LinkedinUser lu);

	int editProfileDAO(LinkedinUser lu);
	
	int deleteProfileDAO(LinkedinUser lu);

	


	

	

	

}
