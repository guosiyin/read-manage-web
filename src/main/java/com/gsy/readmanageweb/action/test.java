package com.gsy.readmanageweb.action;


import com.gsy.readmanageweb.business.manage.testManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {

    @Autowired
    private testManage tests;

    @ResponseBody
    @RequestMapping("/test")
    public int count(){
        int count =  tests.count();
        return count;
    }

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

}
