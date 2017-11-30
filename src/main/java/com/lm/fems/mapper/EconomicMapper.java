package com.lm.fems.mapper;

import com.lm.fems.domain.Economic;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 经济往来mapper
 */
public interface EconomicMapper {

    @Select("select * from economic")
    List<Economic> SelectAll();

    @InsertProvider(type = EconomicDaoProvider.class, method = "insertOneEconomic")
    Integer insertOne(Economic economic);

    @Delete("delete from economic where ecoID = #{ecoID}")
    Integer delById(int ecoID);

    class EconomicDaoProvider {
        public String insertOneEconomic(Economic economic) {
            String sql = "insert into economic(category, money, ecoName, ecoTime, state, remark) values(";
            sql += "'" + economic.getCategory() + "', '"
                    + economic.getMoney() + "', '"
                    + economic.getEcoName() + "', '"
                    + economic.getEcoTime() + "', '"
                    + economic.getState() + "', '"
                    + economic.getRemark() + "')";
            return sql;
        }
    }

}
