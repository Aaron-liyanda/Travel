package entity;

import java.sql.Date;

public class Activity {
  private int act_id;
  private int act_user_id;
  private String act_name;
  private String act_desc;
  private String act_city;
  private int act_amount;
  private int act_apply_amount;
  private Date act_begin_date;
  private Date act_end_date;
public Activity(int act_id, int act_user_id, String act_name, String act_desc, String act_city, int act_amount,
		int act_apply_amount, Date act_begin_date, Date act_end_date) {
	super();
	this.act_id = act_id;
	this.act_user_id = act_user_id;
	this.act_name = act_name;
	this.act_desc = act_desc;
	this.act_city = act_city;
	this.act_amount = act_amount;
	this.act_apply_amount = act_apply_amount;
	this.act_begin_date = act_begin_date;
	this.act_end_date = act_end_date;
}
public Activity() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAct_id() {
	return act_id;
}
public void setAct_id(int act_id) {
	this.act_id = act_id;
}
public int getAct_user_id() {
	return act_user_id;
}
public void setAct_user_id(int act_user_id) {
	this.act_user_id = act_user_id;
}
public String getAct_name() {
	return act_name;
}
public void setAct_name(String act_name) {
	this.act_name = act_name;
}
public String getAct_desc() {
	return act_desc;
}
public void setAct_desc(String act_desc) {
	this.act_desc = act_desc;
}
public String getAct_city() {
	return act_city;
}
public void setAct_city(String act_city) {
	this.act_city = act_city;
}
public int getAct_amount() {
	return act_amount;
}
public void setAct_amount(int act_amount) {
	this.act_amount = act_amount;
}
public int getAct_apply_amount() {
	return act_apply_amount;
}
public void setAct_apply_amount(int act_apply_amount) {
	this.act_apply_amount = act_apply_amount;
}
public Date getAct_begin_date() {
	return act_begin_date;
}
public void setAct_begin_date(Date act_begin_date) {
	this.act_begin_date = act_begin_date;
}
public Date getAct_end_date() {
	return act_end_date;
}
public void setAct_end_date(Date act_end_date) {
	this.act_end_date = act_end_date;
}
@Override
public String toString() {
	return "Activity [act_id=" + act_id + ", act_user_id=" + act_user_id + ", act_name=" + act_name + ", act_desc="
			+ act_desc + ", act_city=" + act_city + ", act_amount=" + act_amount + ", act_apply_amount="
			+ act_apply_amount + ", act_begin_date=" + act_begin_date + ", act_end_date=" + act_end_date + "]";
}

  
  
}
