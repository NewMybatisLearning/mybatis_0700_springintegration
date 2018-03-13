package com.ymd.learn.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {
	
	 @Bean
	 public MapperScannerConfigurer getMapperScannerConfigurer() {
		 MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		 mapperScannerConfigurer.setBasePackage("com.ymd.learn.mapper");
		 mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		 return mapperScannerConfigurer;
	 }
	
}
