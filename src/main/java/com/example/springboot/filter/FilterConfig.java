package com.example.springboot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean hellFilterRegistrion(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new HelloFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
