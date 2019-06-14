package org.buding.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * */
@Configuration
@EnableTransactionManagement
@MapperScan({"org.buding.dto","org.buding.dao"})
public class MyBatisConfig {
}
