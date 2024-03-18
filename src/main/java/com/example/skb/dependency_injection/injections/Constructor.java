package com.example.skb.dependency_injection.injections;


import com.example.skb.dependency_injection.beans.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Constructor {

	@Autowired
	public Constructor(StartEngine startEngine, StopEngine stopEngine){
		log.info("Constructor: " + startEngine.getStatus());
		log.info("Constructor: " + stopEngine.getStatus());
	}
}
