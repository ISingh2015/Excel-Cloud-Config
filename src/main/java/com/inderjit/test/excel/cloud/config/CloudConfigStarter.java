package com.inderjit.test.excel.cloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author Inderjit Singh Sanhotra
 * @version 1.0.0
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableConfigServer
public class CloudConfigStarter {

    static Logger logger = LoggerFactory.getLogger(CloudConfigStarter.class);

    public static void main(String... args) {
        logger.info("***************************Starting cloud configuration server ****************");
        SpringApplication.run(CloudConfigStarter.class, args);
    }
}
