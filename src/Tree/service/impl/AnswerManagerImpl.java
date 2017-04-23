package Tree.service.impl;

import java.util.Date;

import Tree.po.Answer;
import Tree.service.AnswerManager;
import Tree.service.util.ManagerTemplate;

public class AnswerManagerImpl extends ManagerTemplate implements AnswerManager {

	@Override
	public void save(int pid, int uid, String reply) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Answer a = new Answer(pid,uid,reply,date);
		this.getAnswerDao().save(a);
	}

}
