package Tree.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.AnswerDao;
import Tree.po.Answer;

public class AnswerDaoHibernate extends HibernateDaoSupport implements AnswerDao {

	@Override
	public void save(Answer answer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(answer);
	}

	@Override
	public void update(Answer answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Answer answer) {
		// TODO Auto-generated method stub

	}

}
