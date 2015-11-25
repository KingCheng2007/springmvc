package com.solomon.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.solomon.beans.DredgingPlanBean;
import com.solomon.dao.DredgingPlanDao;
import com.solomon.service.DredgingPlanManager;

@Service("dredgingPlanManager")
public class DredgingPlanManagerImpl implements DredgingPlanManager {

	@Autowired
	@Qualifier("dredgingPlanDao")
	private DredgingPlanDao dredgingPlanDao;

	@Override
	public List<DredgingPlanBean> listDrePlanAll(Long customerId) {
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
		List<DredgingPlanBean> list = dredgingPlanDao.getListBySqlClass(sql, DredgingPlanBean.class, objects);
		System.out.println("+++"+list.get(0).getStartTime());
		return list;
	}
}
