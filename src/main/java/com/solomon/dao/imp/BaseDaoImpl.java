package com.solomon.dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.solomon.dao.BaseDao;
import com.solomon.utils.GenericsUtils;
@SuppressWarnings("unchecked")
@Transactional
@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T>{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	private Class<T> clazz;
	
	/**
	 * 无参构造器
	 */
	public BaseDaoImpl() {
		clazz = GenericsUtils.getSuperClassGenricType(this.getClass());
	}

	@Override
	public List<T> getAll() {
		String hql = "from Carinfo"+clazz.getName();
		System.out.println("0.hql=========="+hql);
		return getByHql("from Carinfo");
	}

	@Override
	public void add(T t) {
		sessionFactory.getCurrentSession().save(t);
	}
	
	@Override
	public void addOrUpdate(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	@Override
	public void del(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}
	
	@Override
	public void update(T t) {
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public List<T> getByHql(String hql, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			query.setParameter(i, objects[i]);
		}
		return query.list();
	}

	@Override
	public void batchByHql(String hql, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			query.setParameter(i, objects[i]);
		}
		query.executeUpdate();
	}

	@Override
	public T get(Long id) {
		return (T)sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public List getListByHql(String hql, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			query.setParameter(i, objects[i]);
		}
		List l = query.list();
		log.info("list的大小为：========="+l.size());
		return l;
	}

	@Override
	public List<?> getListBySqlClass(String sql,Class className, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(className);
		for(int i = 0 ; i < objects.length ; i ++){
			query.setParameter(i, objects[i]);
		}
		log.info("sql" + query.getQueryString());
		List<?> l = query.list();
		log.info("list的大小为：========="+l.size());
		return l;
	}

}
