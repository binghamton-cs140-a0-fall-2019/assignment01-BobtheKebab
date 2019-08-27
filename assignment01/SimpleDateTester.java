package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	
	public static void main(String[] args) {
		
		SimpleDate a = SimpleDate.of(2000, 8, 16);
		SimpleDate b = SimpleDate.of(2000, 8, 15);
		SimpleDate c = SimpleDate.of(1900, 8, 15);
		
		System.out.println(a.before(b)); // False
		System.out.println(b.before(a)); // True
		System.out.println(c.before(b)); // True
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			
			SimpleDate a2 = SimpleDate.of(2000, 8, 16);
			SimpleDate b2 = SimpleDate.of(2000, 8, 15);
			SimpleDate c2 = SimpleDate.of(1900, 8, 15);
			
			output.println(a2.before(b2)); // False
			output.println(b2.before(a2)); // True
			output.println(c2.before(b2)); // True
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}