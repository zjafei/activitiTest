package com.mengxuegu.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

public class ActivitiTest01 {

    // 创建activiti流程引擎实例
    @Test
    public void getProcessEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println("processEngine: " + processEngine);
    }
}
