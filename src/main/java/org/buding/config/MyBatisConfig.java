package org.buding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MyBatis配置类
 * */
@Configuration
@EnableTransactionManagement
@MapperScan({"org.buding.dto","org.buding.dao"})
public class MyBatisConfig {
}
