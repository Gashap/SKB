package com.example.skb.dependency_injection.injections;


import com.example.skb.dependency_injection.beans.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Setter {

	@Autowired
	public void setStartEngine(StartEngine startEngine){
		log.info("Setter: " + startEngine.getStatus());
	}

	@Autowired
	public void setStopEngine(StopEngine stopEngine){
		log.info("Setter: " + stopEngine.getStatus());
	}
}
