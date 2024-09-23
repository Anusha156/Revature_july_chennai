package com.projects.quickcart.admin.dto;

import com.projects.quickcart.admin.entity.UserStatus;

import lombok.Data;

@Data
public class CurrentUser {
	private long userId;
	private String role;
	private UserStatus status;
	private String username;

}
