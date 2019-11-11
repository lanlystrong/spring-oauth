package org.spring.oauth.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author llg
 * @description 数据源配置
 * @date 2019/11/11
 */
@Configuration
public class DataSourceConfigure {
    @Value("${spring.datasource.druid.filters}")
    private String filters;
    @Value("${spring.datasource.druid.exceptionSorter}")
    private String exceptionSorter;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        try {
            dataSource.setFilters(filters);
            dataSource.setExceptionSorter(exceptionSorter);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
