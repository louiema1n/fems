package com.lm.fems.controller;

import com.lm.fems.domain.Economic;
import com.lm.fems.service.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 经济往来controller
 */
@RequestMapping("/eco")
@RestController
public class EconomicController {

    @Autowired
    private EconomicService economicService;

    /**
     * 获取所有economic数据
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Economic> listAll() {
        return this.economicService.getAll();
    }

    /**
     * 新增economic
     * @param economic
     */
    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    public void addOneIncome(Economic economic) {
        this.economicService.addOne(economic);
    }

    /**
     * 删除economic
     * @param ecoID
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public void delOneById(@PathVariable("id") int ecoID) {
        this.economicService.delOneById(ecoID);
    }

    /**
     * 获取总金额
     * @return
     */
    @RequestMapping(value = "/totalMoney", method = RequestMethod.GET)
    public Double calcTotalMoney() {
        return this.economicService.calcTotalMoney();
    }
}
