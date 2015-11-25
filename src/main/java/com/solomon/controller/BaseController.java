package com.solomon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;

public class BaseController {
	
	private final String REDIRECT_URL_PRE = "redirect:";

	Log log = LogFactoryImpl.getLog(Thread.currentThread().getClass().getName());
	
	protected String redirect(String url){
		return REDIRECT_URL_PRE+url;
	}
}
