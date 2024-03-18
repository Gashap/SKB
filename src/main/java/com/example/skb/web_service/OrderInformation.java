package com.example.skb.web_service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class OrderInformation {
	private double price = 125;
	private Object info;
	private int id;
	private String date = "18-03-2-24";
}
