package com.lm.fems.controller;

import com.lm.fems.domain.Project;
import com.lm.fems.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * 项目管理controller
 */
@RequestMapping("/prj")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 获取所有project数据
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Project> listAll() {
        return this.projectService.getAll();
    }

    /**
     * 新增project
     * @param project
     */
    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    public void addOneIncome(Project project) {
        this.projectService.addOne(project);
    }

    /**
     * 删除project
     * @param ecoID
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public void delOneById(@PathVariable("id") int ecoID) {
        this.projectService.delOneById(ecoID);
    }

    /**
     * 根据strtime获取project
     * @param strtime
     * @return
     */
    @RequestMapping(value = "/{strtime}", method = RequestMethod.GET)
    public List<Project> getByStrtime(@PathVariable Timestamp strtime) {
        return this.projectService.getByStrtime(strtime);
    }

    @RequestMapping(value = "/cpt", method = RequestMethod.POST)
    public void updById(Project project) {
        this.projectService.updById(project);
    }

}
