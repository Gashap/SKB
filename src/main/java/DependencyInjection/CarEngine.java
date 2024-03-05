package DependencyInjection;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class CarEngine{
	@Bean
	public Car startCar(){
		new Car().startEngine(true);
		log.info("Машина заведена");
		return new Car();
	}

	@Bean
	public Car stopCar(){
		new Car().startEngine(false);
		log.info("Машина заглохла");
		return new Car();
	}
}
