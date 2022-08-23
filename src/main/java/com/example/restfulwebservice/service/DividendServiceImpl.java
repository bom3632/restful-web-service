package com.example.restfulwebservice.service;

import com.example.restfulwebservice.dao.DividendDao;
import com.example.restfulwebservice.dto.DividendDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividendServiceImpl implements DividendService {

    @Autowired
    DividendDao dividendDao;

    @Override
    public List<DividendDto> getDividends(String tkr) {
        return dividendDao.getDividends(tkr);
    }
}
