package Activities;

public class Activity8 {
	public void exceptinTest(String str) throws StringisEmptyException{
		if(str.isEmpty()) {
			throw new StringisEmptyException("String cannot be empty");
		}
		else {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Activity8 obj = new Activity8();
		try {
			obj.exceptinTest("This will be printed");
			obj.exceptinTest("");
		}
		catch(StringisEmptyException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("End of the program");
	}
}