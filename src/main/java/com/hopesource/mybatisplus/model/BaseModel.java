package com.hopesource.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class BaseModel {
    @TableId(type =  IdType.AUTO)
    protected Long id;

    @TableId(type = IdType.UUID)
    protected String uuid;

    @Version
    protected int version;

    @TableField(fill = FieldFill.INSERT)
    protected String createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected String lastUpdateTime;
}
