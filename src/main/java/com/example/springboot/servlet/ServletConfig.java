package com.example.springboot.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean indexServletRegistration(){
        ServletRegistrationBean registration = new ServletRegistrationBean(new IndexServlet(),"/indexServlet");
        return registration;
    }
}



