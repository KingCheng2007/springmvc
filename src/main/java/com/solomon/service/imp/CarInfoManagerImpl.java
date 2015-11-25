package com.solomon.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.solomon.dao.CarInfoDao;
import com.solomon.entity.CarInfo;
import com.solomon.service.CarInfoManager;

@Service("carInfoManager")
public class CarInfoManagerImpl implements CarInfoManager {
	@Autowired
	@Qualifier("carInfoDao")
	private CarInfoDao carInfoDao;

	@Override
	public List<CarInfo> listCarInfoAll() {
		return carInfoDao.getAll();
	}

	@Override
	public CarInfo getCarInfoById(String id) {
		Long l_id = Long.parseLong(id);
		System.out.println("<><>"+l_id);
		return carInfoDao.get(l_id);
	}

}