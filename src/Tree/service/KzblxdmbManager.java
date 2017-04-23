package Tree.service;

import java.util.List;

import Tree.po.Kzblxdmb;



public interface KzblxdmbManager {
	
	public static final int PAGE_SIZE = 20;
	
	/*
	 *分页
	 */
	public List<Kzblxdmb> getADataByPage(int page);

	public List<Kzblxdmb> QueryAll();
	
	int getLength();
	
	public List<Kzblxdmb> fbByname(String name);
	
}
