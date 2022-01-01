package com.example.restfulwebservice.dao;

import com.example.restfulwebservice.dto.DividendDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DividendDao")
public class DividendDaoImpl implements DividendDao{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<DividendDto> getDividends(String tkr) {
        System.out.println("#TKR:"+tkr);
        return sqlSession.selectList("mapper.dividend.getDividends", tkr);
    }
}
