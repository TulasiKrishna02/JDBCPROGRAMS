package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.durgasoft.beans.Hello;
import com.durgasoft.beans.Welcome;
@Configuration
public class AppConfig {
	@Bean
	public Hello hello() {
		return new Hello();
		
	}
	@Bean("welcomeBean")
	public Welcome welcome() {
		return new Welcome();
	}
	

}
