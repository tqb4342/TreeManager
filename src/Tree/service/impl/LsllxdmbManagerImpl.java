package Tree.service.impl;

import java.util.List;

import Tree.po.Kzblxdmb;
import Tree.po.Lsllxdmb;
import Tree.service.LsllxdmbManager;
import Tree.service.util.ManagerTemplate;


public class LsllxdmbManagerImpl extends ManagerTemplate implements LsllxdmbManager {

	@Override
	public List<Lsllxdmb> getADataByPage(int page) {
		// TODO Auto-generated method stub
		return (List<Lsllxdmb>)this.getLsllxdmbDao().findDataByPage((page - 1) * PAGE_SIZE, PAGE_SIZE);
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.getLsllxdmbDao().getLength();
	}

	@Override
	public List<Lsllxdmb> fbByname(String name) {
		// TODO Auto-generated method stub
		return this.getLsllxdmbDao().fdByName(name);
	}

}
