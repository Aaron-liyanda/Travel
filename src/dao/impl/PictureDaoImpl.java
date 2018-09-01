package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import entity.*;
import dao.PictureDao;
import dbutil.DbUtil;
import entity.Picture;

public class PictureDaoImpl implements PictureDao {

	@Override
	public List getPicList(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT pic_path FROM picture WHERE sen_id=?";
		Object param[]={sen_id};
		List<String> pic_pathList=runner.query(sql, param, new ColumnListHandler<String>(1));
		return pic_pathList;
	}
	//找图片路径，返回图片对象,测试通过
		public List getPictureList(String senicName) throws SQLException{
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			String sql="SELECT * from picture,senic where sen_name=? and senic.sen_id=picture.sen_id;";
			Object param[]={senicName};
			 List list = (List) runner.query(sql, new BeanListHandler(Picture.class),param);   
			return list;
		}

		@Override
		public String getPictureBySenicName(String senicName) throws SQLException {
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			String sql="SELECT picture.pic_path from picture,senic where sen_name=? and senic.sen_id=picture.sen_id LIMIT 1";
			Object param[]={senicName};
			//List<String> picture = (List<String>) runner.query(sql, param,new ColumnListHandler<Stirng>(1));
			List<String> picture2 = (List<String>) runner.query(sql, param,new ColumnListHandler());
			String pic=picture2.get(0);
			return pic;
		}		
		//qzh
		@Override
		public List getpicturelist() {
			// TODO Auto-generated method stub
			return null;
		}

	

}
