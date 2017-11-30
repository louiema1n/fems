package com.lm.fems.controller;

import com.lm.fems.service.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private EconomicService economicService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("totalMoney", this.economicService.calcTotalMoney());
        return "main";
    }

    @RequestMapping("/ecoList")
    public String inList() {
        return "eco/ecoList";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
