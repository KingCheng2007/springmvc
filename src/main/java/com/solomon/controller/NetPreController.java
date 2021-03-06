package com.solomon.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solomon.beans.NetPreBean;
import com.solomon.entity.CrmCustomer;
import com.solomon.service.NetPreManager;

@Controller
@RequestMapping("/netPre")
public class NetPreController extends BaseController {

	@Resource(name = "netPreManager")
	private NetPreManager netPreManager;

	@RequestMapping("/toJson")
	@ResponseBody
	public Map<String, Object> getListMap(HttpServletRequest request) {
		Long customerId = ((CrmCustomer) request.getSession().getAttribute("crmCustomer")).getId();
		List<NetPreBean> list = netPreManager.listNetPreAll(customerId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", list.size());
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/toList")
	public String list(HttpServletRequest request) {
		return "/netPreList";
	}

}
