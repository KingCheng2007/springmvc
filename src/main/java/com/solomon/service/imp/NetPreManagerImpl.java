package com.solomon.service.imp;

import java.util.List;

import com.solomon.beans.NetPreBean;
import com.solomon.dao.SoBoatForeDao;
import com.solomon.service.NetPreManager;


public class NetPreManagerImpl implements NetPreManager {
	
	private SoBoatForeDao soBoatForeDao;
	
	public void setSoBoatForeDao(SoBoatForeDao soBoatForeDao) {
		this.soBoatForeDao = soBoatForeDao;
	}

	@Override
	public List<NetPreBean> listNetPreAll(Long customerId) {
		String sqlfore = "SELECT  f.id AS id, b.boat_chinesename AS boatCnName, b.BOAT_ENGLISHNAME as boatEnName, REPLACE(STRAGG(DISTINCT c1.CUSTOMER_NAME), ',', '/') cdName, REPLACE(STRAGG(DISTINCT c2.CUSTOMER_NAME), ',', '/') hzName, REPLACE(STRAGG(DISTINCT c3.CUSTOMER_NAME), ',', '/') hdName, REPLACE(STRAGG(DISTINCT m.name), ',', '/') mineName, (DECODE(f.web_prearrived, '0', '未提交', '1', '已提交', '2', '已确认')) status, (DECODE(f.ADSS_STATUS, '0', '已引用(预到)', '1', '下锚', '2', '靠泊', '3', '作业', '4', '离港', '5', '网上预到')) boatPos FROM so_boat_fore f LEFT JOIN so_boat b ON (f.fk_boat_id = b.id) LEFT JOIN so_boat_shipper s ON (s.FK_BOAT_FORE_ID = f.id) LEFT JOIN so_mine m ON (m.id = s.fk_mine_id) LEFT JOIN CRM_CUSTOMER c1 ON (c1.id = F.FK_CRM_CUSTOMER_ID1) LEFT JOIN CRM_customer c2 ON (c2.id = s.fk_crm_customer_id2) LEFT JOIN CRM_customer c3 ON (c3.id = s.fk_crm_customer_id3) where 1 = 1 and (c1.id = ? or c2.id=? or c3.id=?) group by f.id, b.boat_chinesename, b.boat_englishname, f.web_prearrived, f.adss_status";
		Object objects[] = {customerId,customerId,customerId};
		System.out.println("customerId============"+customerId);
		@SuppressWarnings("unchecked")
		List<NetPreBean> list = soBoatForeDao.getListBySqlClass(sqlfore,NetPreBean.class, objects);
		return list;
	}

}
