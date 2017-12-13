package com.lm.ims.mapper;

import com.lm.ims.domain.Project;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * 项目管理mapper
 */
public interface ProjectMapper {

    @Select("select * from project")
    List<Project> SelectAll();

    @InsertProvider(type = ProjectDaoProvider.class, method = "insertOneProject")
    Integer insertOne(Project project);

    @Delete("delete from project where prjid = #{prjid}")
    Integer delById(int prjid);

    @Select("select * from project where strtime <= #{strtime} and state = #{state}")
    List<Project> selectByStrtime(@Param("strtime") Timestamp strtime, @Param("state") int state);

    @UpdateProvider(type = ProjectDaoProvider.class, method = "updById")
    Integer upd(Project project);

    class ProjectDaoProvider {
        public String insertOneProject(Project project) {
            String sql = "insert into project(prjname, phase, mainwork, requirement, leader, assistant, reviewer, strtime, etoc, endtime, state, remark) values(";
            sql += "'" + project.getPrjname() + "', '"
                    + project.getPhase() + "', '"
                    + project.getMainwork() + "', '"
                    + project.getRequirement() + "', '"
                    + project.getLeader() + "', '"
                    + project.getAssistant() + "', '"
                    + project.getReviewer() + "', '"
                    + project.getStrtime() + "', '"
                    + project.getEtoc() + "', '"
                    + project.getEndtime() + "', '"
                    + project.getState() + "', '"
                    + project.getRemark() + "')";
            return sql;
        }

        public String updById(Project project) {
            String sql = "update project set ";
            if (project.getEndtime() != null) {
                sql += "endtime = '" + project.getEndtime() + "', ";
            }
            if (project.getEtoc() != null) {
                sql += "etoc = '" + project.getEtoc() + "', ";
            }
            if (project.getStrtime() != null) {
                sql += "strtime = '" + project.getStrtime() + "', ";
            }
            if (project.getReviewer() != null) {
                sql += "reviewer = '" + project.getReviewer() + "', ";
            }
            if (project.getAssistant() != null) {
                sql += "assistant = '" + project.getAssistant() + "', ";
            }
            if (project.getLeader() != null) {
                sql += "leader = '" + project.getLeader() + "', ";
            }
            if (project.getRequirement() != null) {
                sql += "requirement = '" + project.getRequirement() + "', ";
            }
            if (project.getMainwork() != null) {
                sql += "mainwork = '" + project.getMainwork() + "', ";
            }
            if (project.getPhase() != null) {
                sql += "phase = '" + project.getPhase() + "', ";
            }
            if (project.getPrjname() != null) {
                sql += "prjname = '" + project.getPrjname() + "', ";
            }
            if (project.getRemark() != null) {
                sql += "remark = '" + project.getRemark() + "', ";
            }
            if (project.getState() != 0) {
                sql += "state = '" + project.getState() + "', ";
            }
            sql = sql.substring(0, sql.lastIndexOf(", "));
            return sql + " where prjid = " + project.getPrjid();
        }
    }

}
