package com.solomon.service;

import java.util.List;

import com.solomon.beans.NetPreBean;

public interface NetPreManager {

	List<NetPreBean> listNetPreAll(Long customerId);

}
