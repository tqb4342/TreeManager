package Tree.dao;

import java.util.List;

import Tree.po.Question;

public interface QuestionDao {

	void save(Question question);

	void update(Question question);

	void delete(Question question);
	
	List<Question> findall();
	
	
	Question getById(int pid);
}
