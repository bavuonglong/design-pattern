package com.cuongnv.designpattern.creational.simplefactory;

import lombok.Data;

@Data
public class BlogPost extends Post {
    private String author;
    private String[] tags;
}
