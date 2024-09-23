package com.projects.quickcart.buyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.projects.quickcart.buyer.dto.CurrentUser;
import com.projects.quickcart.buyer.service.CartService;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private CartService service;

	@GetMapping
	public String getOrdersView(@SessionAttribute CurrentUser user, Model model) {
		model.addAttribute("orders", service.getOrders(user.getUserId()));
		return "customer/orders";
	}

	@PutMapping
	public String putOrderStatus(@SessionAttribute CurrentUser user, @RequestParam long orderDetailId) {
		service.cancelOrder(user.getUserId(), orderDetailId);
		return "redirect:/orders";
	}
}
