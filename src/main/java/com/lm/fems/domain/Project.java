package com.lm.fems.domain;

import java.sql.Timestamp;

/**
 *  项目管理实体
 */
public class Project {

    private int prjid;
    private String prjname;
    private String phase;
    private String mainwork;
    private String requirement;
    private String leader;
    private String assistant;
    private String reviewer;
    private Timestamp strtime;
    private Timestamp etoc;
    private Timestamp endtime;
    private int state;
    private String remark;

    public int getPrjid() {
        return prjid;
    }

    public void setPrjid(int prjid) {
        this.prjid = prjid;
    }

    public String getPrjname() {
        return prjname;
    }

    public void setPrjname(String prjname) {
        this.prjname = prjname;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getMainwork() {
        return mainwork;
    }

    public void setMainwork(String mainwork) {
        this.mainwork = mainwork;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Timestamp getStrtime() {
        return strtime;
    }

    public void setStrtime(Timestamp strtime) {
        this.strtime = strtime;
    }

    public Timestamp getEtoc() {
        return etoc;
    }

    public void setEtoc(Timestamp etoc) {
        this.etoc = etoc;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
