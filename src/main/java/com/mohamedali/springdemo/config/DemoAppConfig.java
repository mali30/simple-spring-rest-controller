package com.mohamedali.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"com.mohamedali.springdemo.config",
	"com.mohamedali.springdemo.rest"})
public class DemoAppConfig {

}
