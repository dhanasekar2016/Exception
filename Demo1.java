package Exception;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String name=null;
		try {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException ae) {
			System.out.println("mathematical issue");
		}
		catch(NullPointerException npe) {
			System.out.println("Value not present");
			System.out.println(npe);
			npe.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
