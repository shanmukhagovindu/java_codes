package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
	private List<String> passengers;
	private int maxpassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	public Activity6(int maxpassengers) {
		this.maxpassengers = maxpassengers;
		this.passengers = new ArrayList<>();
	}

	void onboard(String passengersName) {
		if (passengers.size() <= maxpassengers) {
			this.passengers.add(passengersName);
		} else {
			System.out.println("plane is full");

		}

	}

	public Date setTakeoff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}

	public void setLand() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}

	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}

	public List<String> getPassengers() {
		return passengers;
	}

	public static void main(String[] args) throws InterruptedException {
		Activity6 plane = new Activity6(10);
		plane.onboard("praveen");
		plane.onboard("venu");
		plane.onboard("chandu");

		System.out.println("Plane take off at:" + plane.setTakeoff());
		System.out.println("people on the plane:" + plane.getPassengers());
		Thread.sleep(5000);
		plane.setLand();
		System.out.println("plane landed at:" + plane.getLastTimeLanded());
		System.out.println("people on the plane after landing:" + plane.getPassengers());

	}
}
