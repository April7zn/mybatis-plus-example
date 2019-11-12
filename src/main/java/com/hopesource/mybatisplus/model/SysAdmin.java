package com.hopesource.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_admin")
@Data
public class SysAdmin extends BaseModel {
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
