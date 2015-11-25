package com.solomon.service;

import java.util.List;

import com.solomon.beans.DredgingNoticeBean;



public interface DredgingNoticeManager {

	public List<DredgingNoticeBean> listDreNoticeAll(Long customerId);
}
