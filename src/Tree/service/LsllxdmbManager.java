package Tree.service;

import java.util.List;

import Tree.po.Lsllxdmb;


public interface LsllxdmbManager {

	
	public static final int PAGE_SIZE = 80;
	
	/*
	 *分页
	 */
	public List<Lsllxdmb> getADataByPage(int page);
	int getLength();
	
	public List<Lsllxdmb> fbByname(String name);
	
}
