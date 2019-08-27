package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
	
	public static void main(String[] args) {
		
		DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
		StreetUSAddress addr = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
		Person a = new Person("John", "Doe", "777777777", pdob, addr);
		
		System.out.println(a);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			
			DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
			StreetUSAddress addr2 = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
			Person a2 = new Person("John", "Doe", "777777777", pdob, addr);
			
			output.println(a2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}