package service;

import java.sql.SQLException;
import java.util.List;

import entity.Zan;

public interface ZanService {

	public List<Zan> getZan(int pla_re_id) throws SQLException;
	//×¢²áµãÔÞÊÂ¼þ
	public boolean makeZan(Zan zan) throws  SQLException;
}
