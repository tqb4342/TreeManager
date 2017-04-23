package Tree.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.JslzyzwzdmbDao;
import Tree.po.Jslzyzwzdmb;
import Tree.po.Kzblxdmb;

public class JslzyzwzdmbDaoHibernate extends HibernateDaoSupport implements JslzyzwzdmbDao {

	@Override
	public void save(Jslzyzwzdmb jslzyzwzdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(jslzyzwzdmb);
	}

	@Override
	public void update(Jslzyzwzdmb jslzyzwzdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(jslzyzwzdmb);
	}

	@Override
	public void delete(Jslzyzwzdmb jslzyzwzdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(jslzyzwzdmb);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Jslzyzwzdmb> findAll() {
		// TODO Auto-generated method stub
		return (List<Jslzyzwzdmb>)getHibernateTemplate().find("from Jslzyzwzdmb");
	}

	@Override
	public int getLength() {
		final String hql = "select count(*) from Jslzyzwzdmb";
		int count = getHibernateTemplate().execute(
				new HibernateCallback<Long>() {
					@Override
					public Long doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						return (long) query.uniqueResult();
					}
				}).intValue();
		
		return count;
	}

	@Override
	public List<Jslzyzwzdmb> findDataByPage(final int offset, final int pageSize) {
		final String hql = "from Jslzyzwzdmb";
		List list=getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException 
			{
				List result=session.createQuery(hql)
						.setFirstResult(offset)
						.setMaxResults(pageSize)
						.list();
				return result;
			}
			
		});
		return list;
	}

	@Override
	public List<Jslzyzwzdmb> fdByName(String name) {
		String hql = "from Jslzyzwzdmb where race = '"+name+"'";
		@SuppressWarnings("unchecked")
		List<Jslzyzwzdmb> list = getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list;
		}
		return null;
	}

}
