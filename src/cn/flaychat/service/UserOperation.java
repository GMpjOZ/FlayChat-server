package cn.flaychat.service;

import javax.servlet.http.HttpServletResponse;

import cn.flaychat.model.User;
import cn.flaychat.util.GsonUtil;
import cn.flaychat.util.MD5Util;

public class UserOperation extends BaseService{

	public User login(int id ,String password){
		
		String md5 = MD5Util.getMD5(password);
		 return (User) getSession().createQuery(//
				"FROM User u WHERE u.id=? AND u.password=?")//
				.setParameter(0, id)//
				.setParameter(1, md5)// 密码要使用MD5摘要
				.uniqueResult();
		
		
	}
	
	public void register(User u){
	
		getSession().save(u);
		
	}
}
