package com.hopesource.mybatisplus.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hopesource.mybatisplus.dao.StaffMapper;
import com.hopesource.mybatisplus.dao.SysAdminMapper;
import com.hopesource.mybatisplus.dao.UserMapper;
import com.hopesource.mybatisplus.model.BaseQuery;
import com.hopesource.mybatisplus.model.SysAdmin;
import com.hopesource.mybatisplus.model.SysAdminQuery;
import com.hopesource.mybatisplus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Autowired
    private UserMapper userMapper;

    @DS("hos-user")
    @GetMapping("hello.do")
    public Object hello(){
//        List<Map<String,String>> result = jdbcTemplate.query("select * from staff", new RowMapper<Map<String, String>>() {
//            @Override
//            public Map<String, String> mapRow(ResultSet rs, int i) throws SQLException {
//                Map<String,String> m = new HashMap<>();
//                m.put(rs.getString("first_name"),rs.getString("email"));
//                return m;
//            }
//        });
        return userMapper.selectList(null);
    }

    @DS("hos-user")
    @GetMapping("insert.do")
    public Object insert(User user){
        userMapper.insert(user);
        return user;
    }

    @GetMapping("list")
    public Object list(BaseQuery query){
        return sysAdminMapper.selectList(new QueryWrapper<SysAdmin>());
//        .lambda()
//                .ge(SysAdmin::getCreateTime, query.getBeginDate())
//                .le(SysAdmin::getCreateTime, query.getEndDate())
    }

    @GetMapping("get/{id}")
    public Object get(@PathVariable Long id){
        return sysAdminMapper.selectById(id);
    }


}
