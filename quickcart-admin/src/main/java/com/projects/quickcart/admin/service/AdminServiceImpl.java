package com.projects.quickcart.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.quickcart.admin.dao.AdminDAO;
import com.projects.quickcart.admin.entity.MyUser;
import com.projects.quickcart.admin.entity.UserStatus;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;

	@Override
	public List<MyUser> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public void updateUserStatus(long userId, UserStatus status) {
		dao.updateUserStatus(userId, status);

	}

}
