package Tree.po;


import java.util.HashSet;
import java.util.Set;

public class User {

	Integer uid;
	String account;
	String username;
	String password;
	Integer age;
	String sex;
	Integer flag;
	Set<Question> question = new HashSet<Question>();
	Set<Answer> answer = new HashSet<Answer>();
	public User(Integer uid, String count, String username, String password, Integer age, String sex, Integer flag) {
		super();
		this.uid = uid;
		this.account = count;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.flag = flag;
	}
	public User() {
		super();
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Set<Question> getQuestion() {
		return question;
	}
	public void setQuestion(Set<Question> question) {
		this.question = question;
	}
	public Set<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", count=" + account + ", username=" + username + ", password=" + password + ", age="
				+ age + ", sex=" + sex + ", flag=" + flag + "]";
	}
	
	
}
