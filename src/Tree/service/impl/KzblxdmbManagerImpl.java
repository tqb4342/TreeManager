package Tree.service.impl;

import java.util.List;

import Tree.po.Kzblxdmb;
import Tree.service.KzblxdmbManager;
import Tree.service.util.ManagerTemplate;

public class KzblxdmbManagerImpl extends ManagerTemplate implements KzblxdmbManager {

	@Override
	public List<Kzblxdmb> QueryAll() {
		// TODO Auto-generated method stub
		return this.getKzblxdmbDao().findAll();
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.getKzblxdmbDao().getLength();
	}

	@Override
	public List<Kzblxdmb> getADataByPage(int page) {
		// TODO Auto-generated method stub
		return (List<Kzblxdmb>)this.getKzblxdmbDao().findDataByPage((page - 1) * PAGE_SIZE, PAGE_SIZE);
	}

	@Override
	public List<Kzblxdmb> fbByname(String name) {
		// TODO Auto-generated method stub
		return this.getKzblxdmbDao().fdByName(name);
	}

}
