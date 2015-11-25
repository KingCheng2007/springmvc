package com.solomon.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.hibernate.SessionFactory;

/**
 * DAO基类
 * @author solomon
 * @param <T>
 */
public interface BaseDao<T> {
	Log log = LogFactoryImpl.getLog(Thread.currentThread().getClass().getName());

	public List<T> getAll();

	public void add(T t);
	
	public void addOrUpdate(T t);

	public void del(T t);
	
	public T get(Long id);
	
	public void update(T t);
	
	public List<T> getByHql(String hql,Object... objects);
	
	public void batchByHql(String hql,Object... objects);
	
	public List getListByHql(String hql,Object...objects);
	
	/**
	 * @param sql 原生SQL
	 * @param className 注入类名Class
	 * @param objects 参数
	 * @return
	 */
	public List getListBySqlClass(String sql,Class className,Object...objects);
	
}
