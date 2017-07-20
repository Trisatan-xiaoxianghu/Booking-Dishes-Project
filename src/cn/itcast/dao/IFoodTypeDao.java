package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.FoodType;

public interface IFoodTypeDao {

	/**
	 * ���
	 */
	void save(FoodType foodType);
	
	/**
	 * ����
	 */
	void update(FoodType foodType);
	
	/**
	 * ɾ��
	 */
	void delete(int id);
	
	/**
	 * ����������ѯ
	 */
	FoodType findById(int id);
	
	/**
	 * ��ѯȫ��
	 */
	List<FoodType> getAll();
	
	/**
	 * ���ݲ�ϵ���Ʋ�ѯ
	 */
	List<FoodType> getAll(String typeName);
	
	
}








