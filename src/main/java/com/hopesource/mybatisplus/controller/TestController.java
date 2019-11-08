package com.hopesource.mybatisplus.controller;

import com.alibaba.fastjson.JSONObject;
import com.hopesource.mybatisplus.dao.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StaffMapper staffMapper;

    @GetMapping("hello.do")
    public String hello(){
//        List<Map<String,String>> result = jdbcTemplate.query("select * from staff", new RowMapper<Map<String, String>>() {
//            @Override
//            public Map<String, String> mapRow(ResultSet rs, int i) throws SQLException {
//                Map<String,String> m = new HashMap<>();
//                m.put(rs.getString("first_name"),rs.getString("email"));
//                return m;
//            }
//        });
        return JSONObject.toJSONString(staffMapper.count());
    }
}
