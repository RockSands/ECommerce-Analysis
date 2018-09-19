package com.ckw.eca.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.AdClickTrend;

/**
 * 广告点击趋势DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface IAdClickTrendDAO {

	void updateBatch(List<AdClickTrend> adClickTrends);
	
}
