package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
	
	public static void main(String[] args) {
		
		DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
		StreetUSAddress addr = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
		Person a = new Person("John", "Doe", "777777777", pdob, addr);
		
		ComputerOwner b = new ComputerOwner(a);
		for (int i = 0; i < 4; i++) {
			Computer c = new Computer("Dell", "a", 16, 4000, false, 1000.0 * i);
			b.addComputer(c);
		}
		System.out.println(b);
		
		b.removeComputer(3);
		b.removeComputer(2);
		System.out.println(b);
	
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			
			DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
			StreetUSAddress addr2 = new StreetUSAddress("a", "b", "NYC", "NY", "13000");
			Person a2 = new Person("John", "Doe", "777777777", pdob, addr);
			
			ComputerOwner b2 = new ComputerOwner(a2);
			for (int j = 0; j < 4; j++) {
				Computer c2 = new Computer("Dell", "a", 16, 4000, false, 1000.0 * j);
				b2.addComputer(c2);
			}
			output.println(b2);
			
			b2.removeComputer(3);
			b2.removeComputer(2);
			output.println(b2);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}