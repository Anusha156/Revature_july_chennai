package com.projects.quickcart.retailer.dto;

import com.projects.quickcart.retailer.entity.UserStatus;

import lombok.Data;

@Data
public class CurrentUser {
	private long userId;
	private String role;
	private UserStatus status;
	private String username;
}
