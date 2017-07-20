package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Food;
import cn.itcast.utils.PageBean;


public interface IFoodDao {

	/**
	 * ��ҳ�Ұ�������ѯ���еĲ�Ʒ
	 */
	void getAll(PageBean<Food> pb);
	
	/**
	 * ������ͳ�Ʋ�Ʒ���ܼ�¼��
	 */
	int getTotalCount(PageBean<Food> pb);
	
	/**
	 * ����id��ѯ
	 */
	Food findById(int id);
}