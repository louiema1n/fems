package com.lm.fems.service;

import com.lm.fems.domain.Project;
import com.lm.fems.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * 项目管理service
 */
@Service
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 获取所有Project数据
     * @return
     */
    public List<Project> getAll() {
        return this.projectMapper.SelectAll();
    }

    /**
     * 新增Project
     * @param project
     * @return
     */
    public Integer addOne(Project project) {
        return this.projectMapper.insertOne(project);
    }

    /**
     * 删除Project
     * @param prjid
     * @return
     */
    public Integer delOneById(int prjid) {
        return this.projectMapper.delById(prjid);
    }

    /**
     * 根据strtime查询project
     * @param strtime
     * @return
     */
    public List<Project> getByStrtime(Timestamp strtime) {
        return this.projectMapper.selectByStrtime(strtime);
    }

}
