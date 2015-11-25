package com.solomon.dao.imp;

import java.util.List;

import com.solomon.dao.CustomerUserDao;
import com.solomon.entity.CustomerUser;

public class CustomerUserDaoImpl extends BaseDaoImpl<CustomerUser> implements CustomerUserDao{

	@Override
	public CustomerUser getCustomerUserByNameAndPwd(String userName, String pwd) {
		String hql = "from CustomerUser cu where cu.userName = ? and cu.password = ?";
		Object objects[] = {userName,pwd};
		List<CustomerUser> list =  getByHql(hql, objects);
		if(list.isEmpty()||list.size()>1){
			return null;
		}else{
			return list.get(0);
		}
	}


}
