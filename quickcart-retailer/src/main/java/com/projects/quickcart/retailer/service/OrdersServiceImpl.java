package com.projects.quickcart.retailer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.quickcart.retailer.dao.OrdersDAO;
import com.projects.quickcart.retailer.entity.OrderDetail;
import com.projects.quickcart.retailer.entity.OrderStatus;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDAO ordersDAO;

	@Override
	public List<OrderDetail> getOrders(long userId, OrderStatus status) {
		return ordersDAO.getRetailerOrderDetails(userId, status);
	}

	@Override
	public void changeOrderStatus(long userId, long orderDetailId, OrderStatus status) {
		ordersDAO.changeOrderStatus(userId, orderDetailId, status);
	}

}
