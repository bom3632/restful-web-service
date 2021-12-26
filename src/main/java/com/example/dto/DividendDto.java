package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DividendDto {
    private String ric;      // RIC
    private String tkr;     // 티커
    private String rec_dt;     // 배당기준일
    private String py_dt;     // 배당지급일
    private double dvd_r; // 배당금
    private String dvd_curr; //통화

}
