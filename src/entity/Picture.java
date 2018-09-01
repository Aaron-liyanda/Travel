package entity;

public class Picture {

	private int pic_id;
	private String pic_path;
	private int sen_id;
	public Picture(int pic_id, String pic_path, int sen_id) {
		super();
		this.pic_id = pic_id;
		this.pic_path = pic_path;
		this.sen_id = sen_id;
	}
	public Picture() {
		
		// TODO Auto-generated constructor stub
	}
	public int getPic_id() {
		return pic_id;
	}
	public void setPic_id(int pic_id) {
		this.pic_id = pic_id;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public int getSen_id() {
		return sen_id;
	}
	public void setSen_id(int sen_id) {
		this.sen_id = sen_id;
	}
	@Override
	public String toString() {
		return "Picture [pic_id=" + pic_id + ", pic_path=" + pic_path + ", sen_id=" + sen_id + "]";
	}
	
	
	
}
