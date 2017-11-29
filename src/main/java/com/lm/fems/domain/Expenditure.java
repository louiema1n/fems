package com.lm.fems.domain;

import java.sql.Timestamp;

/**
 *  支出实体
 */
public class Expenditure {

    private int expenditureID;
    private String category;
    private double money;
    private Timestamp expenditureTime;
    private String expenditureName;
    private String remark;

    public int getExpenditureID() {
        return expenditureID;
    }

    public void setExpenditureID(int expenditureID) {
        this.expenditureID = expenditureID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Timestamp getExpenditureTime() {
        return expenditureTime;
    }

    public void setExpenditureTime(Timestamp expenditureTime) {
        this.expenditureTime = expenditureTime;
    }

    public String getExpenditureName() {
        return expenditureName;
    }

    public void setExpenditureName(String expenditureName) {
        this.expenditureName = expenditureName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
