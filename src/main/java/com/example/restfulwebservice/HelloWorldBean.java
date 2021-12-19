package com.example.restfulwebservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok(setter/getter...etc)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;

}
