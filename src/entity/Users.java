package entity;

import java.util.Date;

public class Users {
  
	private int id;
	private String user_name;
	private String user_pwd;
	private String user_phone;
	private String user_address;
	private String user_email;
	private Date user_birthday;
	private String user_qq;
	private String user_photo;
	private int identity;
	public Users(int id, String user_name, String user_pwd, String user_phone, String user_address, String user_email,
			Date user_birthday, String user_qq, String user_photo, int identity) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_phone = user_phone;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_birthday = user_birthday;
		this.user_qq = user_qq;
		this.user_photo = user_photo;
		this.identity = identity;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Date getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(Date user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getUser_qq() {
		return user_qq;
	}
	public void setUser_qq(String user_qq) {
		this.user_qq = user_qq;
	}
	public String getUser_photo() {
		return user_photo;
	}
	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_phone=" + user_phone
				+ ", user_address=" + user_address + ", user_email=" + user_email + ", user_birthday=" + user_birthday
				+ ", user_qq=" + user_qq + ", user_photo=" + user_photo + ", identity=" + identity + "]";
	}
	
	
	
}
