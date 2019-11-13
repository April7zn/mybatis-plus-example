package com.hopesource.mybatisplus.model;

import lombok.Data;

@Data
public class SysAdminQuery extends BaseQuery {
    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;
}
