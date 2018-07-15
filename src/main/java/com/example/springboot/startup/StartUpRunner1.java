package com.example.springboot.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class StartUpRunner1 implements CommandLineRunner {
    Logger LOGGER = LoggerFactory.getLogger(StartUpRunner1.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("StartUpRunner1 called!!");
    }
}
