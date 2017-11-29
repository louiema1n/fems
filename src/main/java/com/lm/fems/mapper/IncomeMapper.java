package com.lm.fems.mapper;

import com.lm.fems.domain.Income;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 收入mapper
 */
public interface IncomeMapper {

    @Select("select * from income")
    List<Income> SelectAll();
}
