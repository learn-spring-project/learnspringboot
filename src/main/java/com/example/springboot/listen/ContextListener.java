package com.example.springboot.listen;

import com.example.springboot.filter.HelloFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener
{
    Logger LOGGER = LoggerFactory.getLogger(ContextListener.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.info("ContextListener initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
