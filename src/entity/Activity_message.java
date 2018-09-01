package entity;

import java.sql.Date;

public class Activity_message {
   private int act_msg_id;
   private int act_id;
   private int act_msg_fuser;
   private String act_msg_content;
   private Date act_msg_date;
   
   
   
public Activity_message(int act_msg_id, int act_id, int act_msg_fuser, String act_msg_content, Date act_msg_date) {
	super();
	this.act_msg_id = act_msg_id;
	this.act_id = act_id;
	this.act_msg_fuser = act_msg_fuser;
	this.act_msg_content = act_msg_content;
	this.act_msg_date = act_msg_date;
}
public Activity_message() {
	
	// TODO Auto-generated constructor stub
}
public int getAct_msg_id() {
	return act_msg_id;
}
public void setAct_msg_id(int act_msg_id) {
	this.act_msg_id = act_msg_id;
}
public int getAct_id() {
	return act_id;
}
public void setAct_id(int act_id) {
	this.act_id = act_id;
}
public int getAct_msg_fuser() {
	return act_msg_fuser;
}
public void setAct_msg_fuser(int act_msg_fuser) {
	this.act_msg_fuser = act_msg_fuser;
}
public String getAct_msg_content() {
	return act_msg_content;
}
public void setAct_msg_content(String act_msg_content) {
	this.act_msg_content = act_msg_content;
}
public Date getAct_msg_date() {
	return act_msg_date;
}
public void setAct_msg_date(Date act_msg_date) {
	this.act_msg_date = act_msg_date;
}
@Override
public String toString() {
	return "Activity_message [act_msg_id=" + act_msg_id + ", act_id=" + act_id + ", act_msg_fuser=" + act_msg_fuser
			+ ", act_msg_content=" + act_msg_content + ", act_msg_date=" + act_msg_date + "]";
}

   
   
}
