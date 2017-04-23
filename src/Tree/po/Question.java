package Tree.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Question {

	Integer qid;
	Integer uid;
	String context;
	Date releasedate;
	Set<Answer> answer = new HashSet<Answer>();
	User user;
	public Question(Integer qid, Integer uid, String context, Date releasedate) {
		super();
		this.qid = qid;
		this.uid = uid;
		this.context = context;
		this.releasedate = releasedate;
	}
	public Question() {
		super();
	}
	
	public Question(Integer uid, String context, Date releasedate) {
		super();
		this.uid = uid;
		this.context = context;
		this.releasedate = releasedate;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}
	public Set<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
