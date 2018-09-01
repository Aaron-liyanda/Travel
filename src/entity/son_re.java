package entity;

import java.util.Date;

public class son_re {

	private int son_re_id;
	private String son_re_content;
	private Date son_re_date;
	private int son_re_to;
	private int son_re_my;
	public int getSon_re_id() {
		return son_re_id;
	}
	public void setSon_re_id(int son_re_id) {
		this.son_re_id = son_re_id;
	}
	public String getSon_re_content() {
		return son_re_content;
	}
	public void setSon_re_content(String son_re_content) {
		this.son_re_content = son_re_content;
	}
	public Date getSon_re_date() {
		return son_re_date;
	}
	public void setSon_re_date(Date son_re_date) {
		this.son_re_date = son_re_date;
	}
	public int getSon_re_to() {
		return son_re_to;
	}
	public void setSon_re_to(int son_re_to) {
		this.son_re_to = son_re_to;
	}
	public int getSon_re_my() {
		return son_re_my;
	}
	public void setSon_re_my(int son_re_my) {
		this.son_re_my = son_re_my;
	}
	public son_re(int son_re_id, String son_re_content, Date son_re_date, int son_re_to, int son_re_my) {
		super();
		this.son_re_id = son_re_id;
		this.son_re_content = son_re_content;
		this.son_re_date = son_re_date;
		this.son_re_to = son_re_to;
		this.son_re_my = son_re_my;
	}
	
	public son_re() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "son_re [son_re_id=" + son_re_id + ", son_re_content=" + son_re_content + ", son_re_date=" + son_re_date
				+ ", son_re_to=" + son_re_to + ", son_re_my=" + son_re_my + "]";
	}
	
	
}
