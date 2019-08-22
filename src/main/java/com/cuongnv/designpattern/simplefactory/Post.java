package com.cuongnv.designpattern.simplefactory;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Post {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime publishedOn;
}
