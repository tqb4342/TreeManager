package Tree.po;

import java.util.Date;

public class Answer {

	Integer aid;
	Integer qid;
	Integer uid;
	String reply;
	Date replydate;
	User user;
	Question question;
	public Answer(Integer aid, Integer qid, Integer uid, String reply, Date replydate) {
		super();
		this.aid = aid;
		this.qid = qid;
		this.uid = uid;
		this.reply = reply;
		this.replydate = replydate;
	}
	public Answer() {
		super();
	}
	
	public Answer(Integer qid, Integer uid, String reply, Date replydate) {
		super();
		this.qid = qid;
		this.uid = uid;
		this.reply = reply;
		this.replydate = replydate;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
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
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Date getReplydate() {
		return replydate;
	}
	public void setReplydate(Date replydate) {
		this.replydate = replydate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
