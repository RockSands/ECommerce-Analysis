package com.ckw.eca.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.AdStat;

/**
 * 广告实时统计DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface IAdStatDAO {

	void updateBatch(List<AdStat> adStats);
	
}
