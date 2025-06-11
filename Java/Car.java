package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	public Car(String color, String transmission, int make, int tyres, int doors) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = tyres;
		this.doors = doors;
	}

	public void displayCharacteristics() {
		System.out.println("Car Color:" + color);
		System.out.println("Car transmission:" + transmission);
		System.out.println("Car make:" + make);
		System.out.println("Car tyres:" + tyres);
		System.out.println("Car doors:" + doors);
	}

	public void accelerate() {
		System.out.println("Car is moving farward");
	}

	public void brake() {
		System.out.println("Car Stopped");
	}
}
