package com.example.restfulwebservice.dao;

import com.example.restfulwebservice.dto.DividendDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DividendDao {
        // 특정 종목의 배당내역 조회
        List<DividendDto> getDividends(@Param("_tkr")String tkr);
}
