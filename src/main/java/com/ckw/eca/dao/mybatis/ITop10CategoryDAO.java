package com.ckw.eca.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.Top10Category;

/**
 * top10品类DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface ITop10CategoryDAO {

	void insert(Top10Category category);
	
}
