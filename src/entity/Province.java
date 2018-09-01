package entity;

public class Province {
  private String pro_id;
  private String pro_name;
public String getPro_id() {
	return pro_id;
}
public void setPro_id(String pro_id) {
	this.pro_id = pro_id;
}
public String getPro_name() {
	return pro_name;
}
public void setPro_name(String pro_name) {
	this.pro_name = pro_name;
}
public Province(String pro_id, String pro_name) {
	super();
	this.pro_id = pro_id;
	this.pro_name = pro_name;
}

public Province() {
	
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Province [pro_id=" + pro_id + ", pro_name=" + pro_name + "]";
}
  
}
