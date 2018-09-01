package dao;

import java.sql.SQLException;
import java.util.List;

public interface PictureDao {
	List getpicturelist();
   List getPicList(int sen_id) throws SQLException;
   /*
	 * 根据景点找对应图片
	 */
	List getPictureList(String  senicName)throws SQLException;
	
	//根据一个景点名找第一张图片
	String getPictureBySenicName(String senicName)throws SQLException;
}
