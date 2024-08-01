package com.linkedin.service;

import com.linkedin.DAO.LinkedinDAO;
import com.linkedin.DAO.LinkedinDAOInterface;
import com.linkedin.entity.LinkedinUser;

public class LinkedinService implements LinkedinServiceInterface {

	@Override
	public int createProfileService(LinkedinUser lu) {
		// TODO Auto-generated method stub
		LinkedinDAOInterface ld=new LinkedinDAO();
		
		return ld.createProfileDAO(lu);
	}

	@Override
	public LinkedinUser viewProfileService(LinkedinUser lu) {
		// TODO Auto-generated method stub
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.viewProfileDAO(lu);
	}

}
