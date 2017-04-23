package Tree.service;

import java.util.List;

import Tree.po.Question;

public interface QuestionManager {

	public void save(String content,int uid);
	
	public List<Question> findAll();
	
	public Question getById(int pid);
	
}
