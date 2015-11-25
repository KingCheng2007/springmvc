package com.solomon.service.imp;

import com.solomon.dao.UserDao;
import com.solomon.entity.User;
import com.solomon.service.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUser(Long id) {
		return userDao.get(id);
	}

}