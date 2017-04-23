package Tree.service;

import java.util.List;

import Tree.po.Jslzyzwzdmb;
import Tree.po.Kzblxdmb;


public interface JslzyzwzdmbManager {

public static final int PAGE_SIZE = 80;
	
	/*
	 *分页
	 */
	public List<Jslzyzwzdmb> getADataByPage(int page);
	int getLength();
	
	public List<Jslzyzwzdmb> fbByname(String name);
}
