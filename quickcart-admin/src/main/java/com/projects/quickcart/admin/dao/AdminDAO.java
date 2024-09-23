package com.projects.quickcart.admin.dao;

import java.util.List;

import com.projects.quickcart.admin.entity.MyUser;
import com.projects.quickcart.admin.entity.UserStatus;

public interface AdminDAO {

	List<MyUser> getAllUsers();

	void updateUserStatus(long userId, UserStatus status);

}
