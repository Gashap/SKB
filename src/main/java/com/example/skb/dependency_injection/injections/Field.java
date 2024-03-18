package com.example.skb.dependency_injection.injections;


import com.example.skb.dependency_injection.EngineStatus;
import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Field {

	@Autowired
	private EngineStatus startEngine;
	@Autowired
	private EngineStatus stopEngine;

	@PostConstruct
	public void fieldInjection(){
		log.info("Field: " + startEngine.getStatus());
		log.info("Field: " + stopEngine.getStatus());
	}
}
