package com.ckw.eca.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.Top10Session;

/**
 * top10活跃session的DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface ITop10SessionDAO {

	void insert(Top10Session top10Session);
	
}
