package com.bcn.nn.main.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bcn.nn.main.domain.DataVO;

@Mapper
public interface MainMapper {
	List<DataVO> getData();
	void insertData(DataVO dvo);
	int updateData(DataVO dvo);
	int deleteData(int dataNo);
	DataVO getDataOne(int dataNo);
}
