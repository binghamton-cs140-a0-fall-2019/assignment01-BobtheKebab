package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	
	public static void main(String[] args) {
		
		StreetUSAddress a = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
		StreetUSAddress b = new StreetUSAddress("c", "", "Chicago", "IL", "11100");
		
		System.out.println(a);
		System.out.println(b);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			
			StreetUSAddress a2 = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
			StreetUSAddress b2 = new StreetUSAddress("c", "", "Chicago", "IL", "11100");
			
			output.println(a2);
			output.println(b2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}