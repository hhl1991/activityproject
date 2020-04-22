package com.fengkong.controller;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName hhl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 11:57
 * @Version 1.0
 **/
@RequestMapping("/activity")
@RestController
public class ActivityController {

    private ProcessEngineConfiguration processEngineConfiguration;

    /**
     * 部署流程
     */
    @PostMapping("/deploy")
    public String deploy(){
        //创建ProcessEngineConfiguration对象

        //创建ProcessEngine对象
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        //得到RepositoryService实例
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //进行部署
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("processes/pro1.bpmn")  //添加bpmn资源
                .addClasspathResource("processes/pro1.png")
                .name("请假申请单流程")
                .deploy();
        System.out.println(deployment.getName());
        System.out.println(deployment.getId());
        return "成功";
    }
}
