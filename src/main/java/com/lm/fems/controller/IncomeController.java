package com.lm.fems.controller;

import com.lm.fems.domain.Income;
import com.lm.fems.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 收入controller
 */
@RequestMapping("/in")
@RestController
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    /**
     * 获取所有income数据
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Income> ListAll() {
        return this.incomeService.getAll();
    }
}
