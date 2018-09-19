package com.ckw.eca.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.AdProvinceTop3;

/**
 * 各省份top3热门广告DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface IAdProvinceTop3DAO {

	void updateBatch(List<AdProvinceTop3> adProvinceTop3s);
	
}
