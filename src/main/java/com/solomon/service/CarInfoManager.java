package com.solomon.service;

import java.util.List;

import com.solomon.entity.CarInfo;

public interface CarInfoManager {
	
	List<CarInfo> listCarInfoAll();
	
	CarInfo getCarInfoById(String id);

}
