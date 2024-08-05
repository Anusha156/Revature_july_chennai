package com.linkedin.service;

import java.util.List;

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

	public List<LinkedinUser> viewAllProfileService() {
		// TODO Auto-generated method stub
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.viewAllProfileDAO();
	}

	@Override
	public int editProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.editProfileDAO(lu);
	}
	
	@Override
	public int deleteProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.deleteProfileDAO(lu);
	}

	@Override
	public int loginProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.loginProfileDAO(lu);
		
	}

	public int searchProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=new LinkedinDAO();
		return ld.searchProfileDAO(lu);
		
	}


	

	
}
