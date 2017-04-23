package Tree.service.impl;



import java.util.Date;
import java.util.List;

import Tree.po.Question;
import Tree.service.QuestionManager;
import Tree.service.util.ManagerTemplate;

public class QuestionManagerImpl extends ManagerTemplate implements QuestionManager {

	@Override
	public void save(String content,int uid) {
		Date date = new Date();
		Question q = new Question(uid,content,date);
		this.getQuestionDao().save(q);
		
	}

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return this.getQuestionDao().findall();
	}

	@Override
	public Question getById(int pid) {
		// TODO Auto-generated method stub
		return this.getQuestionDao().getById(pid);
	}

}
