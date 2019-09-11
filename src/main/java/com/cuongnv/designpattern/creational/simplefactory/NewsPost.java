package com.cuongnv.designpattern.creational.simplefactory;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewsPost extends Post {
    private String headline;
    private LocalDate newsTime;
}
