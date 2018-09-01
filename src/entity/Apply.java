package entity;

public class Apply {

	private int apply_id;
	private int apply_suser;
	private String apply_condition;
	private int apply_fuser;
	private int act_id;
	public Apply(int apply_id, int apply_suser, String apply_condition, int apply_fuser, int act_id) {
		super();
		this.apply_id = apply_id;
		this.apply_suser = apply_suser;
		this.apply_condition = apply_condition;
		this.apply_fuser = apply_fuser;
		this.act_id = act_id;
	}
	public Apply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApply_id() {
		return apply_id;
	}
	public void setApply_id(int apply_id) {
		this.apply_id = apply_id;
	}
	public int getApply_suser() {
		return apply_suser;
	}
	public void setApply_suser(int apply_suser) {
		this.apply_suser = apply_suser;
	}
	public String getApply_condition() {
		return apply_condition;
	}
	public void setApply_condition(String apply_condition) {
		this.apply_condition = apply_condition;
	}
	public int getApply_fuser() {
		return apply_fuser;
	}
	public void setApply_fuser(int apply_fuser) {
		this.apply_fuser = apply_fuser;
	}
	public int getAct_id() {
		return act_id;
	}
	public void setAct_id(int act_id) {
		this.act_id = act_id;
	}
	@Override
	public String toString() {
		return "Apply [apply_id=" + apply_id + ", apply_suser=" + apply_suser + ", apply_condition=" + apply_condition
				+ ", apply_fuser=" + apply_fuser + ", act_id=" + act_id + "]";
	}
	
}
