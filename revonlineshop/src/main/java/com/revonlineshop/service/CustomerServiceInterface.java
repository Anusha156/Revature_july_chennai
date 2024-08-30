package com.revonlineshop.service;

import java.util.List;

import com.revonlineshop.entity.Customer;
import com.revonlineshop.entity.Orders;
import com.revonlineshop.entity.Product;
import com.revonlineshop.entity.ShopingCart;

public interface CustomerServiceInterface {

	int addCustomerService(Customer customer);

	int addProductService(Product product);

	int addtoCartService(ShopingCart sCart);

	int addOrderService(Orders order);

	void deleteFromCartService(Object attribute);

	int findMaxOrderService();

	List<Orders> findTotalProductService(Object attribute, int order_no);

	int updateOrderStatusService(String parameter);

	int updateProductService(String attribute, int productId,int quantity);

	String adminLoginService(String email, String pass);

	Customer customerLoginService(String email, String pass);

}
