package com.ckw.eca.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.AdBlacklist;

/**
 * 广告黑名单DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface IAdBlacklistDAO {

	/**
	 * 批量插入广告黑名单用户
	 * @param adBlacklists
	 */
	void insertBatch(List<AdBlacklist> adBlacklists);
	
	/**
	 * 查询所有广告黑名单用户
	 * @return
	 */
	List<AdBlacklist> findAll();
	
}
