package com.solomon.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author DAVY
 *
 */
public class ResourceBean implements BaseBean{
	private FileOutputStream fos;
	private File file;
	
	//初始化方法
	public void init(){
		l.info("ResourceBean:===初始化");
		l.info("ResourceBean:===加载资源，执行一些预操作");
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	//销毁方法
	public void destory(){
		l.info("ResourceBean:===销毁");
		l.info("ResourceBean:===释放资源，执行一些预操作");
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public FileOutputStream getFos() {
		return fos;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
}
