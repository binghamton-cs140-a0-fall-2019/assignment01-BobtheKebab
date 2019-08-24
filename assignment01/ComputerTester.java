package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	
		Computer c = new Computer("Dell", "a", 16, 4000, false, 1000.0);
		Computer o = new Computer("Acer", "b", 8, 2000, true, 800.0);
		Computer m = new Computer("Apple", "c", 8, 500, false, 2000.0);
		Computer p = new Computer("HP", "d", 16, 800, true, 1500.0);
		
		System.out.println(c);
		System.out.println(o);
		System.out.println(m);
		System.out.println(p);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}