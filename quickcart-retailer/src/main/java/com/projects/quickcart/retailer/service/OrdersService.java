package com.projects.quickcart.retailer.service;

import java.util.List;

import com.projects.quickcart.retailer.entity.OrderDetail;
import com.projects.quickcart.retailer.entity.OrderStatus;

public interface OrdersService {

	List<OrderDetail> getOrders(long userId, OrderStatus status);

	void changeOrderStatus(long userId, long orderDetailId, OrderStatus status);

}
