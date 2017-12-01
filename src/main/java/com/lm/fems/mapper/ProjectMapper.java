package com.lm.fems.mapper;

import com.lm.fems.domain.Project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

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

    @Select("select * from project where strtime = #{strtime}")
    List<Project> selectByStrtime(Timestamp strtime);

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
    }

}
