package entity;

public class Permission {

	private int id;
	private String path;
	private String desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Permission(int id, String path, String desc) {
		super();
		this.id = id;
		this.path = path;
		this.desc = desc;
	}
	
	public Permission() {
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", path=" + path + ", desc=" + desc + "]";
	}

	
}
