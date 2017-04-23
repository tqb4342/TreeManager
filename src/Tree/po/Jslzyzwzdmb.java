package Tree.po;

import java.io.Serializable;

public class Jslzyzwzdmb implements Serializable {
	/**
	 * 森林主要植物种代码表
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String code;
	private String race;
	private String engname;
	private String categroy;
	private String section;
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

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEngname() {
		return engname;
	}

	public void setEngname(String engname) {
		this.engname = engname;
	}

	public String getCategroy() {
		return categroy;
	}

	public void setCategroy(String categroy) {
		this.categroy = categroy;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Jslzyzwzdmb(Integer id, String code, String race, String engname,
			String categroy, String section, Integer level) {
		super();
		this.id = id;
		this.code = code;
		this.race = race;
		this.engname = engname;
		this.categroy = categroy;
		this.section = section;
		this.level = level;
	}

	public Jslzyzwzdmb() {
		super();
	}

}
