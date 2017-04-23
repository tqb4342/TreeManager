package Tree.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.LsllxdmbDao;
import Tree.po.Kzblxdmb;
import Tree.po.Lsllxdmb;
import Tree.po.Lsllxdmb;

public class LsllxdmbDaoHibernate extends HibernateDaoSupport implements LsllxdmbDao {

	@Override
	public void save(Lsllxdmb lsllxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(lsllxdmb);
	}

	@Override
	public void update(Lsllxdmb lsllxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(lsllxdmb);
	}

	@Override
	public void delete(Lsllxdmb lsllxdmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(lsllxdmb);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lsllxdmb> findAll() {
		// TODO Auto-generated method stub
		return (List<Lsllxdmb>)getHibernateTemplate().find("from Lsllxdmb");
	}

	@Override
	public int getLength() {
		final String hql = "select count(*) from Lsllxdmb";
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
	public List<Lsllxdmb> findDataByPage(final int offset, final int pageSize) {
		final String hql = "from Lsllxdmb";
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
	public List<Lsllxdmb> fdByName(String name) {
		String hql = "from Lsllxdmb where name = '"+name+"'";
		@SuppressWarnings("unchecked")
		List<Lsllxdmb> list = getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list;
		}
		return null;
	}
}
