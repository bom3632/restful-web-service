package com.example.service;

import com.example.dto.DividendDto;
import com.example.dao.DividendDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividendService {

    @Autowired
    DividendDao dividendDao;

    public List<DividendDto> getDividends() throws Exception {
        return dividendDao.getDividends();
    }
}
