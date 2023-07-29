package Exception;
import java.util.*;
public class VoterApp {
	public static void main(String[] args)throws AgeException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=s.nextLine();
		System.out.println(name);
		
		System.out.println("Enter age: ");
		int age=s.nextInt();
		if(age>18) {
			System.out.println("Eligible for Vote");
		}else {
			
		throw new AgeException("Your not Eligible for Vote");
		}
		//s.nextLine();
		System.out.println("Enter gender: ");
		String gender=s.next();
		System.out.println(gender);
		
		System.out.println("Thank you");
	}

}
