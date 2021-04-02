package web_erp.dto;

public class Title {
	private int no;
	private String name;

	public Title() {
		super();
	}

	public Title(int no) {
		super();
		this.no = no;
	}

	public Title(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Title [no=" + no + ", name=" + name + "]";
	}

}
