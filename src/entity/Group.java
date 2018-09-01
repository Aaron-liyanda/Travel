package entity;

import java.util.List;

public class Group {
     

	private int id;
	private String name;
	private String desc;
	private List permisionList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List getPermisionList() {
		return permisionList;
	}
	public void setPermisionList(List permisionList) {
		this.permisionList = permisionList;
	}
	public Group(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	
	public Group() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
	

	
	
}
