package com.ethan.sb.begin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * 因为需要返回的是视图，所以这里不能再使用！RestController注解，而是使用@Controller
 * return的字符串，其实是引擎模版的文件名（不带后缀）
 */
@Controller
public class AccessController {

    @GetMapping("/index")
    public String getAccess(Map<String, Object> map){

        map.put("name", "Ethan");
        map.put("age", 28);
        map.put("sex", "0");
        map.put("birthday", LocalDateTime.now());

        return "freemarker";//这里返回的字符串必须是freemarker文件的文件名，不可以写后缀
    }

}
