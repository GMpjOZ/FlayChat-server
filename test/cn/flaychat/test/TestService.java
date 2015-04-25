package cn.flaychat.test;



import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.omg.PortableServer.POA;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.flaychat.model.User;


@Service
public class TestService {

	@Resource
	private SessionFactory sessionFactory;

	@Transactional
	public void saveTwoUsers() {
		Session session = sessionFactory.getCurrentSession();

		User u=new User();
		u.setName("pl");
		session.save(u);
	
	}
}
