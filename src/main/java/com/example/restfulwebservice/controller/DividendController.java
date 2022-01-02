package com.example.restfulwebservice.controller;

import com.example.restfulwebservice.dto.DividendDto;
import com.example.restfulwebservice.service.DividendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DividendController {
    // 배당 정보 가져오기
    @Autowired
    DividendService dividendService;
    //파라미터 = 티커
    @GetMapping("/divide/{Tkr}")
    public List<DividendDto> query(@PathVariable(name = "Tkr") String Ticker) throws Exception{
        return dividendService.getDividends(Ticker);
    }
}
