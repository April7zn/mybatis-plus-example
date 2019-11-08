package com.hopesource.mybatisplus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hopesource.mybatisplus.model.Staff;
import org.apache.ibatis.annotations.Select;

public interface  StaffMapper extends BaseMapper<Staff> {
    @Select("SELECT COUNT(0) FROM staff")
    int count();
}
