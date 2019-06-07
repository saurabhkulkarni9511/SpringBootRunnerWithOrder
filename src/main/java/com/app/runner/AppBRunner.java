package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AppBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Runner-B");
	}
	public int getOrder() {
		return 5;
	}
}
