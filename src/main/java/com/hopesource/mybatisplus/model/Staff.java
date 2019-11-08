package com.hopesource.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Staff {
    @TableId
    private String staffId;
    private String firstName;
    private String lastName;
    private String addressId;
    private String picture;
    private String email;
    private String storeId;
    private String active;
    private String username;
    private String password;
    private String lastUpdate;
}
