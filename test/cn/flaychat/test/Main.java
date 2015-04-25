package cn.flaychat.test;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.flaychat.service.LocationServer;

public class Main {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	   
	public void test(){
		 LocationServer ls=(LocationServer) ac.getBean("locationServer");
		 ls.getUsers();
	}
	public static void main(String[] args) {
	Main m=new Main();
	m.test();
		
	}
}
