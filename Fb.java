package Exception;

public class Fb {
	public static void main(String[] args)throws LoginException {
		String []a=args[0].split(",");
		String b=a[0];
		String c=a[1];
		System.out.println("Welcome");
		try {
		if(b.equalsIgnoreCase("Ashok")&&c.equalsIgnoreCase("qwert")) {
			System.out.println("Valid Person");
		}else {
			
			throw new LoginException("InValid Person");
		
		}
		}
		catch(LoginException v) {
		System.out.println(v);
		}
		System.out.println("Thank You");

	}
	

}
