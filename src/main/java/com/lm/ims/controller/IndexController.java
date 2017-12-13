package com.lm.ims.controller;

import com.lm.ims.service.EconomicService;
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
    public String ecoList() {
        return "eco/ecoList";
    }

    @RequestMapping("/project")
    public String prjList() {
        return "work/project";
    }

    @RequestMapping("/today")
    public String timeline() {
        return "work/today";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
