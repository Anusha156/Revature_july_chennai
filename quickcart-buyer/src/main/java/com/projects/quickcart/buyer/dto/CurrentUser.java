package com.projects.quickcart.buyer.dto;

import com.projects.quickcart.buyer.entity.UserStatus;

import lombok.Data;

@Data
public class CurrentUser {
	private long userId;
	private String role;
	private UserStatus status;
	private String username;
}
