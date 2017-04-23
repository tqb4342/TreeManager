package Tree.service.impl;

import javax.servlet.http.HttpSession;

import Tree.po.User;
import Tree.service.util.ManagerTemplate;

public class UserManagerImpl extends ManagerTemplate implements Tree.service.UserManager {

	@Override
	public boolean existUser(String count) {
		Tree.po.User user = null;
		user =  this.getUserDao().get(count);
		if(user==null){
			return true;
		}
		return false;
	}

	@Override
	public void insert(User user) {
		System.out.println(user);
		this.getUserDao().save(user);
		
	}

	@Override
	public boolean login(String account, String password, HttpSession session) {
		User user = null;
		user =  this.getUserDao().get(account);
		if(user == null){
			return false;
		}
		if(user.getPassword().equals(password)){
			session.setAttribute("user", user);
			return true;
		}	
		return false;
	}


	public User checkSession(HttpSession session) {
		if (session.getAttribute("user") == null)
			return null;
		else
			return (User)session.getAttribute("user");
	}
	

	 @Override
    public void quit(HttpSession session) {
        session.invalidate();
    }

	@Override
	public User getById(int uid) {
		// TODO Auto-generated method stub
		return this.getUserDao().getById(uid);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		User uu = this.getUserDao().get(user.getAccount());
		int uid = uu.getUid();
		user.setUid(uid);
		this.getUserDao().update(user);
	}
	
}
