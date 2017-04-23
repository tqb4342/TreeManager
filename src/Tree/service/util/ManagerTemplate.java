package Tree.service.util;

import Tree.dao.AnswerDao;
import Tree.dao.JslzyzwzdmbDao;
import Tree.dao.KzblxdmbDao;
import Tree.dao.LsllxdmbDao;
import Tree.dao.LybkDao;
import Tree.dao.QuestionDao;
import Tree.dao.UserDao;

public class ManagerTemplate implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected UserDao userDao;
	protected AnswerDao answerDao;
	protected QuestionDao questionDao;
	protected JslzyzwzdmbDao jslzyzwzdmbDao;
	protected LsllxdmbDao lsllxdmbDao;
	protected KzblxdmbDao kzblxdmbDao;
	protected LybkDao lybkDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public AnswerDao getAnswerDao() {
		return answerDao;
	}
	public void setAnswerDao(AnswerDao answerDao) {
		this.answerDao = answerDao;
	}
	public QuestionDao getQuestionDao() {
		return questionDao;
	}
	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	public JslzyzwzdmbDao getJslzyzwzdmbDao() {
		return jslzyzwzdmbDao;
	}
	public void setJslzyzwzdmbDao(JslzyzwzdmbDao jslzyzwzdmbDao) {
		this.jslzyzwzdmbDao = jslzyzwzdmbDao;
	}
	public LsllxdmbDao getLsllxdmbDao() {
		return lsllxdmbDao;
	}
	public void setLsllxdmbDao(LsllxdmbDao lsllxdmbDao) {
		this.lsllxdmbDao = lsllxdmbDao;
	}
	public KzblxdmbDao getKzblxdmbDao() {
		return kzblxdmbDao;
	}
	public void setKzblxdmbDao(KzblxdmbDao kzblxdmbDao) {
		this.kzblxdmbDao = kzblxdmbDao;
	}
	public LybkDao getLybkDao() {
		return lybkDao;
	}
	public void setLybkDao(LybkDao lybkDao) {
		this.lybkDao = lybkDao;
	}
	
	

	
}
