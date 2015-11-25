package com.solomon.service.imp;

import com.solomon.dao.CustomerUserDao;
import com.solomon.entity.CustomerUser;
import com.solomon.service.CustomerUserManager;

public class CustomerUserManagerImpl implements CustomerUserManager {

	private CustomerUserDao customerUserDao;

	public void setCustomerUserDao(CustomerUserDao customerUserDao) {
		this.customerUserDao = customerUserDao;
	}

	@Override
	public CustomerUser getCustomerUser(String userName, String pwd) {
		return customerUserDao.getCustomerUserByNameAndPwd(userName, pwd);
	}
	

	@Override
	public CustomerUser getCustomerUser(CustomerUser cUser) {
		System.out.println(customerUserDao==null);
		return null;
	}

}