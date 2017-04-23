package Tree.service.impl;

import Tree.po.Lybk;
import Tree.service.LybeManager;
import Tree.service.util.ManagerTemplate;

public class LybkManagerImpl extends ManagerTemplate implements LybeManager {

	@Override
	public Lybk getByName(String name) {
		// TODO Auto-generated method stub
		Lybk lybk = this.getLybkDao().getByname(name);
		if(lybk == null){
			return null;
		}
		String str = LybkManagerImpl.chulihtml(lybk.getContent());
		lybk.setContent(str);
		return lybk;
	}
	
	
	public static String chulihtml(String str){
		str = str.replace("<html>", "");
		str = str.replace("</html>", "");
		str = str.replace("<body>", "");
		str = str.replace("</body>", "");
		return str;
	}

}
