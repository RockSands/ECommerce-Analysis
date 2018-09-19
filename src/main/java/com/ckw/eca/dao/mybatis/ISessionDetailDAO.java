package com.ckw.eca.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.SessionDetail;

/**
 * Session明细DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface ISessionDetailDAO {

	/**
	 * 插入一条session明细数据
	 * @param sessionDetail 
	 */
	void insert(SessionDetail sessionDetail);
	
	/**
	 * 批量插入session明细数据
	 * @param sessionDetails
	 */
	void insertBatch(List<SessionDetail> sessionDetails);
	
}
