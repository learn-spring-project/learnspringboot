package com.example.springboot.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class StartUpRunner2 implements CommandLineRunner {
    Logger LOGGER = LoggerFactory.getLogger(StartUpRunner2.class);
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("StartUpRunner2 called!!");
    }
}
