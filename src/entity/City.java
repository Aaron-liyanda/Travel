package entity;

public class City {

	private int city_id;
	private String city_name;
	private String city_pro;
	public City(int city_id, String city_name, String city_pro) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.city_pro = city_pro;
	}
	public City() {
		
		// TODO Auto-generated constructor stub
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_pro() {
		return city_pro;
	}
	public void setCity_pro(String city_pro) {
		this.city_pro = city_pro;
	}
	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", city_name=" + city_name + ", city_pro=" + city_pro + "]";
	}
	
}
