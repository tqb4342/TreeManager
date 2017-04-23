package Tree.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.LybkDao;
import Tree.po.Lybk;

public class LybkDaoHibernate extends HibernateDaoSupport implements LybkDao {

	@Override
	public Lybk getByname(String name) {
		String hql = "from Lybk where wordName = '"+name+"'";
		try{
			List<Lybk> list = getHibernateTemplate().find(hql);
			if(list.size()>0){
				return list.get(0);
			}
		}catch(Exception e){
			return null;
		}
		
		return null;
	}

}
