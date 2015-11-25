package com.solomon.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;

public interface BaseBean {
	Log l = LogFactoryImpl.getLog(Thread.currentThread().getClass().getName());
}
