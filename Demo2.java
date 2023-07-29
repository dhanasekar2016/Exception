package Exception;
import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner s=new Scanner (System.in);
		String x;
		System.out.println("Enter a String");
		x=s.nextLine();
		
		try {
		int y= Integer.parseInt(x);
		}catch (NullPointerException n) {
			System.out.println(n);
		}
		catch(NumberFormatException nfe) {
		
		System.out.println(nfe);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(x);
		
		System.out.println("Thank you");
		
	}
	

}
