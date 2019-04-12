package com.platform.web;

import com.platform.common.config.PropertiesListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.platform")
@SpringBootApplication(scanBasePackages = "com.platform")
public class PlatformWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(PlatformWebApplication.class);
        application.addListeners(new PropertiesListener("customer-config.properties"));
        application.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}



