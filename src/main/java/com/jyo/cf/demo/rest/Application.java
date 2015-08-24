package com.jyo.cf.demo.rest;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.*;

/**
 * Created by Jyotsna R on 1/9/15.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource({"/cxf-servlet.xml"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean cxfServlet() {
        CXFServlet cxfServlet = new CXFServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(cxfServlet, "/services/*");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }
}
