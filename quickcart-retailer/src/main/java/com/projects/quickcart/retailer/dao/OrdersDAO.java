package com.projects.quickcart.retailer.dao;

import java.util.List;

import com.projects.quickcart.retailer.entity.OrderDetail;
import com.projects.quickcart.retailer.entity.OrderStatus;

public interface OrdersDAO {

	List<OrderDetail> getRetailerOrderDetails(long userId, OrderStatus status);

	void changeOrderStatus(long retailerId, long orderDetailId, OrderStatus status);

}
