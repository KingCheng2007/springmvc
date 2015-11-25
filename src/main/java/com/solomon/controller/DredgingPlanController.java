package com.solomon.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solomon.beans.DredgingPlanBean;
import com.solomon.entity.CrmCustomer;
import com.solomon.service.DredgingPlanManager;

/**
 * @author solomon
 * 装车计划业务层
 */
@Controller
@RequestMapping("/drePla")
public class DredgingPlanController extends BaseController {

	@Resource(name = "dredgingPlanManager")
	private DredgingPlanManager dredgingPlanManager;

	@RequestMapping("/toJson")
	@ResponseBody
	public Map<String, Object> getListMap(HttpServletRequest request) {
		Long customerId = ((CrmCustomer) request.getSession().getAttribute("crmCustomer")).getId();
		log.info(customerId);
		List<DredgingPlanBean> list = dredgingPlanManager.listDrePlanAll(customerId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", list.size());
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/toList")
	public String list(HttpServletRequest request) {
		return "/drePlanList";
	}

}
