package com.solomon.dao;

import com.solomon.entity.CustomerUser;

/**
 * @author solomon
 * @Date 2015-11-16 13:48
 *
 */
public interface CustomerUserDao extends BaseDao<CustomerUser>{

	CustomerUser getCustomerUserByNameAndPwd(String userName, String pwd);

}
