package com.example.skb.web_service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GetHeader {

	@GetMapping("/headers")
	public ResponseEntity<Map<String, String>> getAllHeaders(HttpServletRequest request) {
		Enumeration<String> headerNames = request.getHeaderNames();
		Map<String, String> headersMap = new HashMap<>();

		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			headersMap.put(headerName, headerValue);
		}

		return ResponseEntity.ok(headersMap);
	}
}
