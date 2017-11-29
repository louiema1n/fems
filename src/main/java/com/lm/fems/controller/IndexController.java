package com.lm.fems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/inList")
    public String inList() {
        return "income/incomeList";
    }
}
