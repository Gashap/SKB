package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	//Использование зависимостей через поле класса
	@Autowired
	private Engine engine1;

	public Car(){}

	public void startEngine(boolean start){
		engine1.isStart();
		if (engine.isStart(start))
			System.out.println("Ра-та-та-та-та");
		else System.out.println("Машины спят");
	}

	//Использование зависимостей через сеттер
	private Engine engine2;

	@Autowired
	public void setEngine(Engine engine, boolean start){
		engine2 = engine;
		if (engine.isStart(start))
			System.out.println("Ра-та-та-та-та");
		else System.out.println("Машины спят");
	}

	//Использование зависимостей через конструктор
	private Engine engine;

	public Car(Engine engine){
		this.engine = engine;
	}



//	//Использование зависимостей через поле класса
//	private Engine engine1 = new CarEngine();
//
//	public Car(Engine engine){
//		this.engine = engine;
//	}
//
//	public Car() {
//	}
//
//	public void startEngine(boolean b){
//		if (engine.isStart(b))
//			System.out.println("Ра-та-та-та-та");
//		else System.out.println("Машины спят");
//	}
//
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//		if (engine.isStart())
//			System.out.println("Ра-та-та-та-та");
//		else System.out.println("Машины спят");
//	}
}
