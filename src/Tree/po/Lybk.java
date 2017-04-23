package Tree.po;

import java.io.Serializable;

public class Lybk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String wordName;
	private String content;
	private String urlAddress;
	private Integer type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWordName() {
		return wordName;
	}

	public void setWordName(String wordName) {
		this.wordName = wordName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrlAddress() {
		return urlAddress;
	}

	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Lybk(String wordName, String content, String urlAddress, Integer type) {
		super();
		this.wordName = wordName;
		this.content = content;
		this.urlAddress = urlAddress;
		this.type = type;
	}

	public Lybk() {
		super();
	}

}
