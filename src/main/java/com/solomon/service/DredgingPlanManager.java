package com.solomon.service;

import java.util.List;

import com.solomon.beans.DredgingPlanBean;



public interface DredgingPlanManager {

	public List<DredgingPlanBean> listDrePlanAll(Long customerId);
}
