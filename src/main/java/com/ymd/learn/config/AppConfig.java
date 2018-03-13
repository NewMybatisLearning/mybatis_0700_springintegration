package com.ymd.learn.config;

import javax.sql.DataSource;


import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@ComponentScan("com.ymd.learn")
@Configuration
@Import({OtherConfig.class})
@PropertySource("classpath:db.properties")
public class AppConfig {
	
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	 }
	
	 @Value("${jdbc.driver}")
	 private String driver;
	 @Value("${jdbc.url}")
	 private String url;
	 @Value("${jdbc.username}")
	 private String username;
	 @Value("${jdbc.password}")
	 private String password;
	 
	 
	 
	 
	 @Bean
	 public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName(this.driver);
	    dataSource.setUrl(this.url);
	    dataSource.setUsername(this.username);
	    dataSource.setPassword(this.password);
	    return dataSource;
	 }
	 
	 @Bean("sqlSessionFactory")
	 public SqlSessionFactoryBean getSqlSessionFactoryBean() {
		 SqlSessionFactoryBean sqlSessionFactoryBean = 
				 new SqlSessionFactoryBean();
		 sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis-configuration.xml"));
		 sqlSessionFactoryBean.setDataSource(getDataSource());
		 return sqlSessionFactoryBean;
	 }
	
	

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
