package com.linkedin.utility;

import java.util.List;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.service.LinkedinService;
import com.linkedin.service.LinkedinServiceInterface;

public class LinkedinServiceFactory {
	public class createObject implements LinkedinServiceInterface {

		@Override
		public int createProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public LinkedinUser viewProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<LinkedinUser> viewAllProfileService() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int editProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int deleteProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int loginProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<LinkedinUser> searchProfileService(LinkedinUser lu) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	private static LinkedinServiceInterface li = null;

	private LinkedinServiceFactory() {

	}

	public static LinkedinServiceInterface createObject(String ss) {
		
		if (ss.equals("user")) {
			if (li == null) {
				li = new LinkedinService();
			}
		}

		return li;
	}

}