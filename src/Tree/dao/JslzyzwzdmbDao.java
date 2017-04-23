package Tree.dao;

import java.util.List;

import Tree.po.Jslzyzwzdmb;


public interface JslzyzwzdmbDao {

	void save(Jslzyzwzdmb jslzyzwzdmb);

	void update(Jslzyzwzdmb jslzyzwzdmb);

	void delete(Jslzyzwzdmb jslzyzwzdmb);
	
	List<Jslzyzwzdmb> findAll();
	
	int getLength();
	
	public List<Jslzyzwzdmb> findDataByPage(final int offset, final int pageSize);
	
	public List<Jslzyzwzdmb> fdByName(String name);
	
}
