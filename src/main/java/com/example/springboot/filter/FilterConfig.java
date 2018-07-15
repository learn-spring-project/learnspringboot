package com.example.springboot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean hellFilterRegistrion(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new HelloFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    /**
     * 字符编码过滤器
     * spring.http.encoding.enabled=false才会生效
     * @return
     */
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setForceEncoding(true);
//        characterEncodingFilter.setEncoding("UTF-8");
//        registrationBean.addUrlPatterns("/*");
//        registrationBean.setFilter(characterEncodingFilter);
//        return registrationBean;
//    }
}
