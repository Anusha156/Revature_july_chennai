package com.revonlineshop.service;

import java.util.List;

import com.revonlineshop.dao.CustomerDAOInterface;
import com.revonlineshop.entity.Customer;
import com.revonlineshop.entity.Orders;
import com.revonlineshop.entity.Product;
import com.revonlineshop.entity.ShopingCart;
import com.revonlineshop.utility.DaoFactory;

public class CustomerService implements CustomerServiceInterface {

	public int addCustomerService(Customer customer) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.addCustomerDAO(customer);
	}

	public int addProductService(Product product) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.addProductDAO(product);
	}

	public int addtoCartService(ShopingCart sCart) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.addtoCartDAO(sCart);
	}

	public int addOrderService(Orders order) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.addOrderDAO(order);
	}

	public void deleteFromCartService(Object attribute) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		cDao.deleteFromCartDAO(attribute);
		
	}

	public int findMaxOrderService() {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.findMaxOrderDAO();
	}

	
	public List<Orders> findTotalProductService(Object attribute, int order_no) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.findTotalProductDAO(attribute,order_no);
	}

	
	public int updateOrderStatusService(String orderId) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.updateOrderStatusDAO(orderId);
	}

	
	public int updateProductService(String attribute, int productId,int quantity) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.updateProductDAO(attribute,productId,quantity);
	}

	
	public String adminLoginService(String email, String pass) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.adminLoginDAO(email,pass);
	}

	
	public Customer customerLoginService(String email, String pass) {
		CustomerDAOInterface cDao=DaoFactory.getObject("customer");
		return cDao.customerLoginDAO(email,pass);
	}

}
