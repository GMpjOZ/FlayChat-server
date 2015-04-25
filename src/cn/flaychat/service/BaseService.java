package cn.flaychat.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class BaseService {

//	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Resource
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		System.out.println(sessionFactory);
		return sessionFactory.getCurrentSession();
	}
}
