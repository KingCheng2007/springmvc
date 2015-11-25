package com.solomon.service;

import com.solomon.entity.CustomerUser;

public interface CustomerUserManager {

	public CustomerUser getCustomerUser(String userName,String pwd);
	
	public CustomerUser getCustomerUser(CustomerUser cUser);

}