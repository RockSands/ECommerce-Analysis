package com.ckw.eca.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;

import com.ckw.eca.domain.PageSplitConvertRate;

/**
 * 页面切片转换率DAO接口
 * @author Administrator
 *
 */
@Mapper
public interface IPageSplitConvertRateDAO {

	void insert(PageSplitConvertRate pageSplitConvertRate);
	
}
