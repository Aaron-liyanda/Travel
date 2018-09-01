package entity;

import java.util.Date;

public class place_remark {

	private int pla_re_id;
	private Date pla_re_date;
	private String pla_re_content;
	private int pla_re_mark;
	private  int pla_re_user;
	private int sen_id;
	public place_remark(int pla_re_id, Date pla_re_date, String pla_re_content, int pla_re_mark, int pla_re_user,
			int sen_id) {
		super();
		this.pla_re_id = pla_re_id;
		this.pla_re_date = pla_re_date;
		this.pla_re_content = pla_re_content;
		this.pla_re_mark = pla_re_mark;
		this.pla_re_user = pla_re_user;
		this.sen_id = sen_id;
	}
	public place_remark() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPla_re_id() {
		return pla_re_id;
	}
	public void setPla_re_id(int pla_re_id) {
		this.pla_re_id = pla_re_id;
	}
	public Date getPla_re_date() {
		return pla_re_date;
	}
	public void setPla_re_date(Date pla_re_date) {
		this.pla_re_date = pla_re_date;
	}
	public String getPla_re_content() {
		return pla_re_content;
	}
	public void setPla_re_content(String pla_re_content) {
		this.pla_re_content = pla_re_content;
	}
	public int getPla_re_mark() {
		return pla_re_mark;
	}
	public void setPla_re_mark(int pla_re_mark) {
		this.pla_re_mark = pla_re_mark;
	}
	public int getPla_re_user() {
		return pla_re_user;
	}
	public void setPla_re_user(int pla_re_user) {
		this.pla_re_user = pla_re_user;
	}
	public int getSen_id() {
		return sen_id;
	}
	public void setSen_id(int sen_id) {
		this.sen_id = sen_id;
	}
	@Override
	public String toString() {
		return "place_remark [pla_re_id=" + pla_re_id + ", pla_re_date=" + pla_re_date + ", pla_re_content="
				+ pla_re_content + ", pla_re_mark=" + pla_re_mark + ", pla_re_user=" + pla_re_user + ", sen_id="
				+ sen_id + "]";
	}
	
	
}
