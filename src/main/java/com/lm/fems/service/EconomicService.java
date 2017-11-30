package com.lm.fems.service;

import com.lm.fems.domain.Economic;
import com.lm.fems.mapper.EconomicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 经济往来service
 */
@Service
public class EconomicService {
    @Autowired
    private EconomicMapper economicMapper;

    /**
     * 获取所有Economic数据
     * @return
     */
    public List<Economic> getAll() {
        return this.economicMapper.SelectAll();
    }

    /**
     * 新增Economic
     * @param economic
     * @return
     */
    public Integer addOne(Economic economic) {
        return this.economicMapper.insertOne(economic);
    }

    /**
     * 删除Economic
     * @param ecoID
     * @return
     */
    public Integer delOneById(int ecoID) {
        return this.economicMapper.delById(ecoID);
    }

    /**
     * 计算剩余总金额
     * @return
     */
    public double calcTotalMoney() {
        List<Economic> economics = this.economicMapper.SelectAll();
        double totalMoney = 0;
        for (Economic economic: economics) {
            // 支出
            if (economic.getState() == 0) {
                totalMoney -= economic.getMoney().doubleValue();
            } else if (economic.getState() == 1){
                totalMoney += economic.getMoney().doubleValue();
            }
        }
        return totalMoney;
    }
}
