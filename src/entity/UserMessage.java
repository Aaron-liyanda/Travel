package entity;

import java.sql.Date;

public class UserMessage {

	private int um_id;
	private String um_content;
	private Date um_date;
	private int um_sendId;
	private int um_getId;
	private String um_state;
	public int getUm_id() {
		return um_id;
	}
	public void setUm_id(int um_id) {
		this.um_id = um_id;
	}
	public String getUm_content() {
		return um_content;
	}
	public void setUm_content(String um_content) {
		this.um_content = um_content;
	}
	public Date getUm_date() {
		return um_date;
	}
	public void setUm_date(Date um_date) {
		this.um_date = um_date;
	}
	public int getUm_sendId() {
		return um_sendId;
	}
	public void setUm_sendId(int um_sendId) {
		this.um_sendId = um_sendId;
	}
	public int getUm_getId() {
		return um_getId;
	}
	public void setUm_getId(int um_getId) {
		this.um_getId = um_getId;
	}
	public String getUm_state() {
		return um_state;
	}
	public void setUm_state(String um_state) {
		this.um_state = um_state;
	}
	public UserMessage(int um_id, String um_content, Date um_date, int um_sendId, int um_getId, String um_state) {
		super();
		this.um_id = um_id;
		this.um_content = um_content;
		this.um_date = um_date;
		this.um_sendId = um_sendId;
		this.um_getId = um_getId;
		this.um_state = um_state;
	}
	@Override
	public String toString() {
		return "UserMessage [um_id=" + um_id + ", um_content=" + um_content + ", um_date=" + um_date + ", um_sendId="
				+ um_sendId + ", um_getId=" + um_getId + ", um_state=" + um_state + "]";
	}
	
	
}
