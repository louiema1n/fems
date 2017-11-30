package com.lm.fems.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *  经济往来实体
 */
public class Economic {

    private int ecoID;
    private String category;
    private BigDecimal money;
    private Timestamp ecoTime;
    private String ecoName;
    private String remark;
    private int state;

    public int getEcoID() {
        return ecoID;
    }

    public void setEcoID(int ecoID) {
        this.ecoID = ecoID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Timestamp getEcoTime() {
        return ecoTime;
    }

    public void setEcoTime(Timestamp ecoTime) {
        this.ecoTime = ecoTime;
    }

    public String getEcoName() {
        return ecoName;
    }

    public void setEcoName(String ecoName) {
        this.ecoName = ecoName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
