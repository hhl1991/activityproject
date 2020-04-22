package com.fengkong.config;

import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName hhl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 10:07
 * @Version 1.0
 **/
//@Configuration
public class ActivityProcessEngineConfiguration {
    @Value("${spring.datasource.url}")
    public String jdbcUrl;
    @Value("${spring.datasource.driver-class-name}")
    public String jdbcDriver;
    @Value("${spring.datasource.username}")
    public String jdbcUsername;
    @Value("${spring.datasource.password}")
    public String jdbcPassword;
    public String databaseSchemaUpdate= "true";

    //@Bean(name = "processEngineConfiguration")
    public ProcessEngineConfiguration setConfig() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        processEngineConfiguration.setDatabaseType("databaseType");
        processEngineConfiguration.setJdbcDriver(jdbcDriver);
        processEngineConfiguration.setJdbcUrl(jdbcUrl);
        processEngineConfiguration.setJdbcUsername(jdbcUsername);
        processEngineConfiguration.setJdbcPassword(jdbcPassword);
        processEngineConfiguration.setDatabaseSchemaUpdate(databaseSchemaUpdate);
        return processEngineConfiguration;
    }

}
