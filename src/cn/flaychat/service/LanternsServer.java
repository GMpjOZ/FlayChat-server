package cn.flaychat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.flaychat.model.Lanterns;
@Service
public class LanternsServer extends BaseService {

	public Lanterns getLanterns(){
		List<Lanterns> lans=(List<Lanterns>) getSession().createQuery("FROM Lanterns lan ").list();
		int i=(int) (Math.random()*lans.size());
		return lans.get(i);
	}
}
