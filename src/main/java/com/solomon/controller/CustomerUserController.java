package com.solomon.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.solomon.entity.CustomerUser;
import com.solomon.service.CrmCustomerManager;
import com.solomon.service.CustomerUserManager;

@Controller
@RequestMapping("/customerUser")
public class CustomerUserController extends BaseController{

	@Resource(name = "customerUserManager")
	private CustomerUserManager customerUserManager;
	
	@Resource(name = "crmCustomerManager")
	private CrmCustomerManager crmCustomerManager;

	@RequestMapping("/doLogin")
	public String doLogin(CustomerUser customerUser, HttpServletRequest request,HttpSession session) {
		log.info("doLogin:==="+customerUser.getUserName()+"<>"+customerUser.getPassword());
		CustomerUser dbCustomerUser = customerUserManager.getCustomerUser(customerUser.getUserName(),customerUser.getPassword());
		log.info("数据库查询用户"+dbCustomerUser);
		session.setAttribute("customerUser", dbCustomerUser);
		session.setAttribute("crmCustomer", crmCustomerManager.getCrmCustomerById(dbCustomerUser.getCrmCustomerId()));
		return redirect("/sign");
	}
	
	@RequestMapping("/toUserDetail")
	public String detaiCustomerUser(HttpServletRequest request) {
		request.setAttribute("customerUser", request.getSession().getAttribute("customerUser"));
		request.setAttribute("crmCustomer", request.getSession().getAttribute("crmCustomer"));
		return "/userDetail";
	}
	
	@RequestMapping("/toCompanyDetail")
	public String detaiCustomer(HttpServletRequest request) {
		request.setAttribute("company", request.getSession().getAttribute("crmCustomer"));
		return "/companyDetail";
	}

}