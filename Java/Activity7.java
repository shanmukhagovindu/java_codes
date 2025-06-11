package Activities;

interface BicycleParts{
	int tyres = 2;
	int maxSpeed = 20;
}

interface BicycleOperations{
	void applyBrake(int decrementValue);
	void speedUp(int incrementValue);
}

class Bicycle implements BicycleOperations, BicycleParts{
	int gears;
	int currentSpeed;
	// constructor
	Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
//}

@Override
public void applyBrake(int decrementValue) {
	System.out.println("Cycle speed decreased");
	if(currentSpeed <= 0) {
		currentSpeed -= decrementValue;
	}else {
		System.out.println("cycle stopped");
	}
}

@Override
public void speedUp(int incrementValue) {
	System.out.println("cycle speed increased");
	if(currentSpeed >= maxSpeed) {
		currentSpeed += incrementValue;
	}else {
		System.out.println("Cycle at max speed");
	}
}

public void bicycleDesc() {
	System.out.println("Bicycle has " + gears + " gears, "+ tyres + " tyres and a maxSpeed of "+ maxSpeed);
	System.out.println("its currentspeed is: " + currentSpeed);
}
}

class MountainBike extends Bicycle{
	int seatHeight;
	
	MountainBike(int gears, int currentSpeed, int seatHeight){
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	@Override
	public void bicycleDesc() {
		System.out.println("Mountain has "+ gears + " gears, "+ tyres + "tyres and a maxSpeed of " + maxSpeed);
		System.out.println("Current seat height is: "+ seatHeight);
		System.out.println("Current speed: "+ currentSpeed);
	}
}
public class Activity7 {
	public static void main(String args[]) {
	    MountainBike mb = new MountainBike(3, 0, 25);
	    mb.bicycleDesc();
	    mb.speedUp(20);
	    mb.applyBrake(5);
	}
}
