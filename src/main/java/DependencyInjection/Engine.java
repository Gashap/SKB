package DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
	boolean isStart(boolean b);

	boolean isStart();

	private double enginePower() {
		return 0;
	}

	private double frequencyRotation() {
		return 0;
	}

	private double efficiency() {
		return 99.99;
	}
}
