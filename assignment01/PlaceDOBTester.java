package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	
	public static void main(String[] args) {
		
		DateAndPlaceOfBirth a = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
		DateAndPlaceOfBirth b = new DateAndPlaceOfBirth(2000, 6, 15, "LA", "CA", "USA");
		DateAndPlaceOfBirth c = new DateAndPlaceOfBirth(1990, 7, 11, "Chicago", "IL", "USA");
		DateAndPlaceOfBirth d = new DateAndPlaceOfBirth(1985, 7, 11, "Berlin", "Germany");
		DateAndPlaceOfBirth e = new DateAndPlaceOfBirth(1970, 8, 20, "Paris", "France");
		
		// print objects
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// olderThan
		System.out.println(a.olderThan(e)); // false
		System.out.println(e.olderThan(a)); // true
		System.out.println(a.olderThan(b)); // false
		
		// youngerThan
		System.out.println(b.youngerThan(d)); // true
		System.out.println(d.youngerThan(b)); // false
		System.out.println(b.youngerThan(a)); // false
		
		// hasSameBirthDateAs
		System.out.println(a.hasSameBirthDateAs(b)); // true
		System.out.println(a.hasSameBirthDateAs(c)); // false
		System.out.println(c.hasSameBirthDateAs(d)); // false
		
		// hasSameBirthDayAs
		System.out.println(a.hasSameBirthDayAs(b)); // true
		System.out.println(d.hasSameBirthDayAs(e)); // false
		System.out.println(c.hasSameBirthDayAs(d)); // true
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

			//Copy all your lines above, add an extra "2" to every variable name
				// and replace every System.out.print or System.out.println
			// by output.print or output.println
		
			DateAndPlaceOfBirth a2 = new DateAndPlaceOfBirth(2000, 6, 15, "NYC", "NY", "USA");
			DateAndPlaceOfBirth b2 = new DateAndPlaceOfBirth(2000, 6, 15, "LA", "CA", "USA");
			DateAndPlaceOfBirth c2 = new DateAndPlaceOfBirth(1990, 7, 11, "Chicago", "IL", "USA");
			DateAndPlaceOfBirth d2 = new DateAndPlaceOfBirth(1985, 7, 11, "Berlin", "Germany");
			DateAndPlaceOfBirth e2 = new DateAndPlaceOfBirth(1970, 8, 20, "Paris", "France");
			
			// print objects
			output.println(a2);
			output.println(b2);
			output.println(c2);
			output.println(d2);
			output.println(e2);
			
			// olderThan
			output.println(a2.olderThan(e2)); // false
			output.println(e2.olderThan(a2)); // true
			output.println(a2.olderThan(b2)); // false
			
			// youngerThan
			output.println(b2.youngerThan(d2)); // true
			output.println(d2.youngerThan(b2)); // false
			output.println(b2.youngerThan(a2)); // false
			
			// hasSameBirthDateAs
			output.println(a2.hasSameBirthDateAs(b2)); // true
			output.println(a2.hasSameBirthDateAs(c2)); // false
			output.println(c2.hasSameBirthDateAs(d2)); // false
			
			// hasSameBirthDayAs
			output.println(a2.hasSameBirthDayAs(b2)); // true
			output.println(d2.hasSameBirthDayAs(e2)); // false
			output.println(c2.hasSameBirthDayAs(d2)); // true
		
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}
		
	}
	
}