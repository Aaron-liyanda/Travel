package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.PictureDao;
import dao.impl.PictureDaoImpl;
import entity.Senic;
import service.PictureService;

public class PictureServiceImpl implements PictureService {
   PictureDao picDao=new PictureDaoImpl();
	@Override
	//根据景点名获取景点所有图片
	public List getPicList(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		
		return picDao.getPicList(sen_id);
	}

	@Override
	//根据景点名得到图片对象链表
	public List getPictureList(String senicName) {
		PictureDao pictureDao=new PictureDaoImpl();
		List pictureList=null;
		try {
			pictureList = pictureDao.getPictureList(senicName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pictureList;
		
	}

	@Override
	//根据景点链表得到每个景点的第一张图片路径
	public String[] getPictures(List<Senic> senicList) {
		String[] pictures=new String[20];
		PictureDao pictureDao=new PictureDaoImpl();
		
		for (int i = 0; i <senicList.size(); i++) {
			try {
				//先有景点，后有图，第i个景点的第1张图片
				
				pictures[i]=pictureDao.getPictureBySenicName(senicList.get(i).getSen_name());//返回第一张图片
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return pictures;
	}
	
}
