package entity;

public class Senic {

	private int sen_id;
	private String sen_name;
	private String sen_desc;
	private String sen_city;
	private String sen_phone;
	public Senic(int sen_id, String sen_name, String sen_desc, String sen_city, String sen_phone) {
		super();
		this.sen_id = sen_id;
		this.sen_name = sen_name;
		this.sen_desc = sen_desc;
		this.sen_city = sen_city;
		this.sen_phone = sen_phone;
	}
	public Senic() {
		
		// TODO Auto-generated constructor stub
	}
	public int getSen_id() {
		return sen_id;
	}
	public void setSen_id(int sen_id) {
		this.sen_id = sen_id;
	}
	public String getSen_name() {
		return sen_name;
	}
	public void setSen_name(String sen_name) {
		this.sen_name = sen_name;
	}
	public String getSen_desc() {
		return sen_desc;
	}
	public void setSen_desc(String sen_desc) {
		this.sen_desc = sen_desc;
	}
	public String getSen_city() {
		return sen_city;
	}
	public void setSen_city(String sen_city) {
		this.sen_city = sen_city;
	}
	public String getSen_phone() {
		return sen_phone;
	}
	public void setSen_phone(String sen_phone) {
		this.sen_phone = sen_phone;
	}
	@Override
	public String toString() {
		return "Senic [sen_id=" + sen_id + ", sen_name=" + sen_name + ", sen_desc=" + sen_desc + ", sen_city="
				+ sen_city + ", sen_phone=" + sen_phone + "]";
	}
	
	
	
}
