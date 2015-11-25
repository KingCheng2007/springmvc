package com.solomon.service.imp;

import com.solomon.dao.CrmCustomerDao;
import com.solomon.entity.CrmCustomer;
import com.solomon.service.CrmCustomerManager;

public class CrmCustomerManagerImpl implements CrmCustomerManager {

	private CrmCustomerDao crmCustomerDao;
	
	public void setCrmCustomerDao(CrmCustomerDao crmCustomerDao) {
		this.crmCustomerDao = crmCustomerDao;
	}

	@Override
	public CrmCustomer getCrmCustomerById(Long crmCustomerId) {
		return crmCustomerDao.get(crmCustomerId);
	}


}