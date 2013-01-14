package com.elasticjogger.codavan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class App
{
    static final Logger logger = LoggerFactory.getLogger(App.class);

    public App()
    {
        logger.info("JavaCode");
    }
}
