package com.zk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/home")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @RequestMapping("json")
    @ResponseBody
    public  String second(@RequestBody String jsonText){
        return jsonText;
    }
}
