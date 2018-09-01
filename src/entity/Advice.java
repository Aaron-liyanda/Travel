package entity;

import java.util.Date;

public class Advice {
	
	private int adv_id;
	private Date adv_date;
	private String adv_content;
	private int user_id;
	
	public Advice() {
		super();
	}
	
	public Advice(int adv_id, Date adv_date, String adv_content, int user_id) {
		super();
		this.adv_id = adv_id;
		this.adv_date = adv_date;
		this.adv_content = adv_content;
		this.user_id = user_id;
	}

	public int getAdv_id() {
		return adv_id;
	}
	public void setAdv_id(int adv_id) {
		this.adv_id = adv_id;
	}
	public Date getAdv_date() {
		return adv_date;
	}
	public void setAdv_date(Date adv_date) {
		this.adv_date = adv_date;
	}
	public String getAdv_content() {
		return adv_content;
	}
	public void setAdv_content(String adv_content) {
		this.adv_content = adv_content;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Advise [adv_id=" + adv_id + ", adv_date=" + adv_date
				+ ", adv_content=" + adv_content + ", user_id=" + user_id + "]";
	}
	

}
