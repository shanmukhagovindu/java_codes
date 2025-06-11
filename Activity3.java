package Activities;

public class Activity3 {
	public static void main(String[] args) {
		int EarthSeconds = 31557600;
		double EarthYears = 1;
		double MercuryYears = 0.2408467;
		double VenusYears = 0.61519726;
		double MarsYears = 1.8808158;
		double JupiterYears = 11.862615;
		double SaturnYears = 29.447498;
		double UranusYears = 84.016846;
		double NeptuneYears = 164.79132;

		int ageSeconds = 1000000000;
		double years = ageSeconds / EarthSeconds;
		System.out.println("MercuryYears: " + (MercuryYears * years));
		System.out.println("VenusYears: " + (VenusYears * years));
		System.out.println("EarthYears: " + (EarthYears * years));
		System.out.println("MarsYears: " + (MarsYears * years));
		System.out.println("JupiterYears: " + (JupiterYears * years));
		System.out.println("SaturnYears: " + (SaturnYears * years));
		System.out.println("UranusYears: " + (UranusYears * years));
		System.out.println("NeptuneYears: " + (NeptuneYears * years));
	}
}
