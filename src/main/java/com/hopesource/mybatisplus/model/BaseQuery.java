package com.hopesource.mybatisplus.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseQuery {
    private Long id;
    private String uuid;
    private Date beginDate;
    private Date EndDate;
}
