package com.solomon.service.imp;

import java.util.List;

import com.solomon.beans.DredgingNoticeBean;
import com.solomon.dao.DredgingNoticeDao;
import com.solomon.service.DredgingNoticeManager;

public class DredgingNoticeManagerImpl implements DredgingNoticeManager {

	private DredgingNoticeDao dredgingNoticeDao;

	public void setDredgingNoticeDao(DredgingNoticeDao dredgingNoticeDao) {
		this.dredgingNoticeDao = dredgingNoticeDao;
	}

	@Override
	public List<DredgingNoticeBean> listDreNoticeAll(Long customerId) {
		String sql = "select req.id as id," +
				" req.pact_no pactNo," +
				" req.boat_name boatName," +
				" req.goods_type mineName," +
				" req.hz_name hzName," +
				" req.consigner_unit hdName," +
				" item.pile pile," +
				" req.quantity sumNum," +
				" req.left_weight sumWorkedNum," +
				" (req.quantity - req.left_weight) sumRemainNum," +
				" req.start_time startTime,"+
				" req.end_time endTime" +
				" From att_scatter_req req left join (select i.fk_att_scatter_req_id, stragg(distinct i.pilename) pile from att_scatter_req_item i group by i.fk_att_scatter_req_id ) item" +
				" on item.fk_att_scatter_req_id = req.id where req.hz_id= ? or req.hd_id = ? or req.lx_id =?" +
				" order by req.last_update_time desc nulls last";
		Object objects[] = {customerId,customerId,customerId};
		@SuppressWarnings("unchecked")
		List<DredgingNoticeBean> list = dredgingNoticeDao.getListBySqlClass(sql, DredgingNoticeBean.class, objects);
		System.out.println("+++"+list.get(0).getStartTime());
		return list;
	}
}
