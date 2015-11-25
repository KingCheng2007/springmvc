package com.solomon.beans;

import java.io.IOException;

public class DependentBean implements BaseBean{
	private ResourceBean resourceBean;
    public void setResourceBean(ResourceBean resourceBean) {  
	        this.resourceBean = resourceBean;  
	}  
	public void write(String ss) throws IOException{
		l.info("DependentBean:===写资源");
		resourceBean.getFos().write(ss.getBytes());
	}
	//初始化方法
	public void init() throws IOException{
		l.info("DependentBean:===初始化");
		resourceBean.getFos().write("DependentBean:===初始化".getBytes());
	}
	//销毁方法
	public void destory() throws IOException{
		l.info("DependentBean:===销毁");
		//在销毁之前需要往文件中写销毁内容  
        resourceBean.getFos().write("DependentBean:=======销毁".getBytes());  
	}
	
}
