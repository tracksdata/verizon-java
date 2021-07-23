package com.cts.eshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao")
public class AppConfig {

}
