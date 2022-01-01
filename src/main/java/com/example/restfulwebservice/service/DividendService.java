package com.example.restfulwebservice.service;

import com.example.restfulwebservice.dto.DividendDto;
import com.example.restfulwebservice.dao.DividendDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividendService {

   @Autowired
    private DividendDao dividendDao;

    public List<DividendDto> getDividends(String tkr) throws Exception {
        return dividendDao.getDividends(tkr);
    }
}
