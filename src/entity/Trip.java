package entity;

public class Trip {

	private int trip_id;
	private String trip_name;
	private String trip_addr;
	private String trip_phone;
	private String trip_email;
	private String trip_desc;
	public int getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(int trip_id) {
		this.trip_id = trip_id;
	}
	public String getTrip_name() {
		return trip_name;
	}
	public void setTrip_name(String trip_name) {
		this.trip_name = trip_name;
	}
	public String getTrip_addr() {
		return trip_addr;
	}
	public void setTrip_addr(String trip_addr) {
		this.trip_addr = trip_addr;
	}
	public String getTrip_phone() {
		return trip_phone;
	}
	public void setTrip_phone(String trip_phone) {
		this.trip_phone = trip_phone;
	}
	public String getTrip_email() {
		return trip_email;
	}
	public void setTrip_email(String trip_email) {
		this.trip_email = trip_email;
	}
	public String getTrip_desc() {
		return trip_desc;
	}
	public void setTrip_desc(String trip_desc) {
		this.trip_desc = trip_desc;
	}
	public Trip(int trip_id, String trip_name, String trip_addr, String trip_phone, String trip_email,
			String trip_desc) {
		super();
		this.trip_id = trip_id;
		this.trip_name = trip_name;
		this.trip_addr = trip_addr;
		this.trip_phone = trip_phone;
		this.trip_email = trip_email;
		this.trip_desc = trip_desc;
	}
	
	public Trip() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trip [trip_id=" + trip_id + ", trip_name=" + trip_name + ", trip_addr=" + trip_addr + ", trip_phone="
				+ trip_phone + ", trip_email=" + trip_email + ", trip_desc=" + trip_desc + "]";
	}
	
	
}
