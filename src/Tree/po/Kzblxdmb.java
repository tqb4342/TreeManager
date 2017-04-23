package Tree.po;

import java.io.Serializable;

public class Kzblxdmb implements Serializable {

	/**
	 * 植被类型代码表
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	private String defination;
	private Integer level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefination() {
		return defination;
	}

	public void setDefination(String defination) {
		this.defination = defination;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Kzblxdmb(Integer id, String code, String name, String defination,
			Integer level) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.defination = defination;
		this.level = level;
	}

	public Kzblxdmb() {
		super();
	}

}
