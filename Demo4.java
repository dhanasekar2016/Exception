package Exception;
import java.io.*;
public class Demo4 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ameer\\OneDrive\\Desktop\\test.t"
				+ "txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1){
			System.out.print((char)(temp));
			
		}
	}

}
