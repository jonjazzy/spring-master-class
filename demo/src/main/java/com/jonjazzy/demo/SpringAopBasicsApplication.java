package com.jonjazzy.demo;

import com.jonjazzy.demo.business.Business1;
import com.jonjazzy.demo.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopBasicsApplication implements CommandLineRunner {

	Logger LOGGER = LoggerFactory.getLogger(SpringAopBasicsApplication.class);

	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopBasicsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(business1.calculateSomething());
		LOGGER.info(business2.calculateSomething());
	}
}
