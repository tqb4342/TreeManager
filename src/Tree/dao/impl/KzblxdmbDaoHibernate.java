package Tree.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.KzblxdmbDao;
import Tree.po.Kzblxdmb;
import Tree.po.Lybk;

public class KzblxdmbDaoHibernate extends HibernateDaoSupport implements KzblxdmbDao {

	@Override
	public void save(Kzblxdmb kzblxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(kzblxdmb);
	}

	@Override
	public void update(Kzblxdmb kzblxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(kzblxdmb);
	}

	@Override
	public void delete(Kzblxdmb kzblxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(kzblxdmb);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Kzblxdmb> findAll() {
		// TODO Auto-generated method stub
		return (List<Kzblxdmb>)getHibernateTemplate().find("from Kzblxdmb");
	}

	@Override
	public int getLength() {
		final String hql = "select count(*) from Kzblxdmb";
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
	public List<Kzblxdmb> findDataByPage(final int offset, final int pageSize) {
		final String hql = "from Kzblxdmb";
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
	public List<Kzblxdmb> fdByName(String name) {
		String hql = "from Kzblxdmb where name = '"+name+"'";
		@SuppressWarnings("unchecked")
		List<Kzblxdmb> list = getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list;
		}
		return null;
	}

}
