package cn.flaychat.service;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseService {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	protected SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
}
