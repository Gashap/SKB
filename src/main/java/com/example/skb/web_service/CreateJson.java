package com.example.skb.web_service;

import jakarta.annotation.PostConstruct;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;

@RestController
@Component
@Log4j2
public class CreateJson {

	@SneakyThrows
	@GetMapping
	@PostConstruct
	public void getOrderInformation() {
		OrderInformation order = new OrderInformation();
		order.setId(ReformatJson.id());

		int id = order.getId();
		double price = order.getPrice();
		String date = order.getDate();

		JSONObject infoDetails = new JSONObject();
		if (order.getId() != 0)
			infoDetails.put("id", id);
		if (order.getDate() != null)
			infoDetails.put("date", date);

		JSONObject info = new JSONObject();
		if (order.getPrice() != 0)
			info.put("price", price);
		info.put("info", infoDetails);

		JSONArray employeeList = new JSONArray();
		employeeList.put(info);

		try (FileWriter file = new FileWriter("src/main/java/com/example/skb/web_service/order_info.json")) {
			file.write(employeeList.toString());
			file.flush();
			log.info("Файл успешно записан");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
