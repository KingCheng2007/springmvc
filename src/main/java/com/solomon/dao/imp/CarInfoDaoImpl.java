package com.solomon.dao.imp;

import org.springframework.stereotype.Repository;

import com.solomon.dao.CarInfoDao;
import com.solomon.entity.CarInfo;

@Repository("carInfoDao")
public class CarInfoDaoImpl extends BaseDaoImpl<CarInfo> implements CarInfoDao{


}
