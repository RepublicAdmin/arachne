package com.republic.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.republic")
@EnableWebMvc
public class Configuration {
    public Configuration() {
        System.out.println("config");
    }
}
