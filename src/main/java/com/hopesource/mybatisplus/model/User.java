package com.hopesource.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("hs_user")
@Data
public class User extends BaseModel{

    private String username;
    private String password;

}
