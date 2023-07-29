package Exception;
import java.util.*;
public class Demo3 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter name");
		String x=s.nextLine();
		System.out.println("Welcom");
		char c=0;
		try {
		 c=x.charAt(6);
		}catch(NullPointerException n) {
		System.out.println(n);
		}
		catch (NumberFormatException n) {
			System.out.println(n);
		}
		catch(StringIndexOutOfBoundsException b) {
			System.out.println(b);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(c);
		System.out.println("Thank you");
	}

}
