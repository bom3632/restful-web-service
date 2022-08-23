package com.example.restfulwebservice.dao;

import com.example.restfulwebservice.dto.DividendDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DividendDao")
public class DividendDaoImpl implements DividendDao{

    private final SqlSession sqlSession;

    public DividendDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<DividendDto> getDividends(String tkr) {
        System.out.println("INPUT #TKR:"+tkr);
        return sqlSession.selectList("mapper.dividend.getDividends", tkr);
    }
}
