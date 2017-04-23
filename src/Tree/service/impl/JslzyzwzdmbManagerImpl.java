package Tree.service.impl;

import java.util.List;

import Tree.po.Jslzyzwzdmb;
import Tree.service.JslzyzwzdmbManager;
import Tree.service.util.ManagerTemplate;

public class JslzyzwzdmbManagerImpl extends ManagerTemplate implements JslzyzwzdmbManager {

	@Override
	public List<Jslzyzwzdmb> getADataByPage(int page) {
		// TODO Auto-generated method stub
		return (List<Jslzyzwzdmb>)this.getJslzyzwzdmbDao().findDataByPage((page - 1) * PAGE_SIZE, PAGE_SIZE);
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.getJslzyzwzdmbDao().getLength();
	}

	@Override
	public List<Jslzyzwzdmb> fbByname(String name) {
		// TODO Auto-generated method stub
		return this.getJslzyzwzdmbDao().fdByName(name);
	}

}
