package com.example.skb.dependency_injection.beans;

import com.example.skb.dependency_injection.EngineStatus;
import org.springframework.stereotype.Component;

@Component
public class StopEngine  implements EngineStatus {

	@Override
	public String getStatus() {
		return "Двигатель не работает";
	}
}
