package Tree.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Tree.dao.QuestionDao;
import Tree.po.Question;

public class QuestionDaoHibernate extends HibernateDaoSupport implements QuestionDao {

	@Override
	public void save(Question question) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(question);
	}

	@Override
	public void update(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Question> findall() {
		// TODO Auto-generated method stub
		return (List<Question>)getHibernateTemplate().find("from Question");
	}

	@Override
	public Question getById(int pid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Question.class, pid);
	}

}
