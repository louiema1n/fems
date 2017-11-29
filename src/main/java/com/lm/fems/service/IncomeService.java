package com.lm.fems.service;

import com.lm.fems.domain.Income;
import com.lm.fems.mapper.IncomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收入service
 */
@Service
public class IncomeService {
    @Autowired
    private IncomeMapper incomeMapper;

    /**
     * 获取所有income数据
     * @return
     */
    public List<Income> getAll() {
        return this.incomeMapper.SelectAll();
    }
}
