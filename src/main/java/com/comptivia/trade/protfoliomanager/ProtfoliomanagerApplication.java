package com.comptivia.trade.protfoliomanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProtfoliomanagerApplication {

	private static Logger log = LoggerFactory.getLogger(ProtfoliomanagerApplication.class);

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ProtfoliomanagerApplication.class);
		application.run(args);
		log.info("Application started -- DJ");
	}

}
