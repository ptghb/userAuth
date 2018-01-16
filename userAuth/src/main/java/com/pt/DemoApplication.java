package com.pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * springboot初始化
 * @author gehb
 *
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // 注意这里要指向原先用main方法执行的Application启动类
//        return builder.sources(DemoApplication.class);
//    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
