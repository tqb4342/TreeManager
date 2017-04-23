package Tree.dao;

import java.util.List;

import Tree.po.Kzblxdmb;
import Tree.po.Lsllxdmb;

public interface LsllxdmbDao {

	void save(Lsllxdmb lsllxdmb);

	void update(Lsllxdmb lsllxdmb);

	void delete(Lsllxdmb lsllxdmb);
	
	List<Lsllxdmb> findAll();
	
	int getLength();
	
	public List<Lsllxdmb> findDataByPage(final int offset, final int pageSize);
	
	public List<Lsllxdmb> fdByName(String name);
	
}
