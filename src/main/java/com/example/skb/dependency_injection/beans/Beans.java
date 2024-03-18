package com.example.skb.dependency_injection.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Beans {
	@PostConstruct
	public void beanCreate() {
		System.out.println("Бин был создан");
	}

	@PreDestroy
	public void beanDestroy() {
		System.out.println("Бин был разрушен");
	}
}
