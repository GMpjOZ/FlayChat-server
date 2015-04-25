package cn.flaychat.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.flaychat.model.User;
@Service
@Transactional

public class LocationServer extends BaseService{

	public boolean saveLocation(double latitude,double longitude,int id){
		User u=(User) getSession().createQuery("FROM User u WHERE u.id=? ")//
				.setParameter(0, id)//
				.uniqueResult();
		u.setLatitude(latitude);
		u.setLongitude(longitude);
		getSession().update(u);
		return true;
	}
	
	public List<User> getUsers(){
		List<User> users=getSession().createQuery("FROM User u ").list();
		System.out.println(users.size());
		return users;
	}
}
