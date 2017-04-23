package Tree.dao;

import java.util.List;

import Tree.po.Kzblxdmb;



public interface KzblxdmbDao {

	void save(Kzblxdmb kzblxdmb);

	void update(Kzblxdmb kzblxdmb);

	void delete(Kzblxdmb kzblxdmb);
	
	List<Kzblxdmb> findAll();
	
	int getLength();
	
	public List<Kzblxdmb> findDataByPage(final int offset, final int pageSize);
	
	
	public List<Kzblxdmb> fdByName(String name);
	
}
