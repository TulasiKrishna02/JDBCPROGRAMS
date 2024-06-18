package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.durgasoft.beans.Welcome;

@Configuration
public class AppConfig {

	@Bean
	public Welcome welcome() {
		return new Welcome();
	}

}
