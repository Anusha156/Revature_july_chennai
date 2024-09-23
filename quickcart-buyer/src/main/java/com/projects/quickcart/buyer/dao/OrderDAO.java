package com.projects.quickcart.buyer.dao;

import java.util.List;

import com.projects.quickcart.buyer.entity.CartItem;
import com.projects.quickcart.buyer.entity.Order;
import com.projects.quickcart.buyer.entity.OrderDetail;
import com.projects.quickcart.buyer.entity.PaymentDetail;

public interface OrderDAO {

	double getCartValue(long customerId);

	List<CartItem> getCartItems(long userId);

	void save(PaymentDetail paymentDetail);

	void save(Order order);

	void save(OrderDetail detail);

	List<Order> getCustomerOrders(long customerId);

	void cancelCustomerOrder(long customerId, long orderDetailId);

}
