package service;

import java.sql.SQLException;
import java.util.List;

import entity.Senic;

/**
 * 图片服务接口
 * @author hxs
 *
 */
public interface PictureService {
    //查询景点图片路径
	List getPicList(int sen_id) throws SQLException;
	/*
	 * 根据景点找对应图片
	 */
	List getPictureList(String  senicName);
	//得到每个景点对应的图片
	String[] getPictures(List<Senic> senicList);
}
