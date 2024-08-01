package com.linkedin.DAO;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinDAOInterface {

	int createProfileDAO(LinkedinUser lu);

	LinkedinUser viewProfileDAO(LinkedinUser lu);

	

}
