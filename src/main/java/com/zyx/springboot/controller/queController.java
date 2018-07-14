package com.zyx.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class queController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/query")
    @ResponseBody
    public Map<String,Object> queList(){
            List<Map<String, Object>> lists = jdbcTemplate.queryForList("select * from dept");
            return lists.get(0);
    }

}
