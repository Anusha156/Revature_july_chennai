package com.projects.quickcart.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.projects.quickcart.admin.dto.CurrentUser;
import com.projects.quickcart.admin.entity.UserStatus;
import com.projects.quickcart.admin.service.AdminService;

public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping
	public ModelAndView getUserAndView(@SessionAttribute(required = false) CurrentUser user,
			@RequestParam(required = false) String role) {
		ModelAndView mView = new ModelAndView("admin/users");
		if (role == null || role.isBlank()) {
			mView.addObject("users", adminService.getAllUsers());
		} else {
			mView.addObject("users",
					adminService.getAllUsers().stream().filter(u -> u.getRole().equals(role)).toList());
		}

		return mView;
	}

	@PutMapping
	public ModelAndView putUserStatus(@SessionAttribute(required = false) CurrentUser user, @RequestParam long userId,
			@RequestParam UserStatus status) {
		ModelAndView mView = new ModelAndView("redirect:/admin/users");
		adminService.updateUserStatus(userId, status);
		return mView;
	}

}
