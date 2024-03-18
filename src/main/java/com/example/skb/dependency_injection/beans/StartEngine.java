package com.example.skb.dependency_injection.beans;

import com.example.skb.dependency_injection.EngineStatus;
import org.springframework.stereotype.Component;

@Component
public class StartEngine implements EngineStatus {

	@Override
	public String getStatus() {
		return "Двигатель работает";
	}
}
