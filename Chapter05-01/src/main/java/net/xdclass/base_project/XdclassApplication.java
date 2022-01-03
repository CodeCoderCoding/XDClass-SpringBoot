package net.xdclass.base_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication //一个注解顶下面3个
public class XdclassApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XdclassApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(XdclassApplication.class, args);
    }

}