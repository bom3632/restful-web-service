package com.example.controller;

import com.example.dto.DividendDto;
import com.example.service.DividendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DividendController {

//    @Autowired
    DividendService dividendService;

    @GetMapping("/divide")
    public List<DividendDto> query() throws Exception{
        return dividendService.getDividends();
    }
}
