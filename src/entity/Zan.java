package entity;

public class Zan {

	private int zan_id;
	private int user_id;
	private int pla_re_id;
	public Zan(int zan_id, int user_id, int pla_re_id) {
		super();
		this.zan_id = zan_id;
		this.user_id = user_id;
		this.pla_re_id = pla_re_id;
	}
	public Zan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getZan_id() {
		return zan_id;
	}
	public void setZan_id(int zan_id) {
		this.zan_id = zan_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPla_re_id() {
		return pla_re_id;
	}
	public void setPla_re_id(int pla_re_id) {
		this.pla_re_id = pla_re_id;
	}
	@Override
	public String toString() {
		return "Zan [zan_id=" + zan_id + ", user_id=" + user_id + ", pla_re_id=" + pla_re_id + "]";
	}
	
	
}
