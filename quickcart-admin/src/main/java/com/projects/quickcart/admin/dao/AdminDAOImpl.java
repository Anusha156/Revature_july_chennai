package com.projects.quickcart.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projects.quickcart.admin.entity.MyUser;
import com.projects.quickcart.admin.entity.UserStatus;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<MyUser> getAllUsers() {
		return sessionFactory.fromSession(session -> {
			return session.createQuery("from User", MyUser.class).getResultList();
		});
	}

	@Override
	public void updateUserStatus(long userId, UserStatus status) {
		sessionFactory.inTransaction(session -> {
			MyUser user = session.get(MyUser.class, userId);
			user.setStatus(status);
			session.merge(user);
		});
	}
}
