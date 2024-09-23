package com.projects.quickcart.admin.service;

import java.util.List;

import com.projects.quickcart.admin.entity.MyUser;
import com.projects.quickcart.admin.entity.UserStatus;

public interface AdminService {

	List<MyUser> getAllUsers();

	void updateUserStatus(long userId, UserStatus status);

}
