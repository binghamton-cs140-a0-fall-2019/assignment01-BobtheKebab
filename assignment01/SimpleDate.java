package assignment01;

public class SimpleDate {
	
	int year;
	int month;
	int day;
	
	public static SimpleDate of(int yr, int m, int d) {
		
		SimpleDate date = new SimpleDate();
		date.year = yr;
		date.month = m;
		date.day = d;
		return date;
		
	}
	
	public boolean before(SimpleDate other) {
		
		// LocalDate
		boolean bool = false;
		if (this.year < other.year) {
			bool = true;
		} else if (this.year == other.year) {
			if (this.month < other.month) {
				bool = true;
			} else if (this.month == other.month) {
				if (this.day < other.day) {
					bool = true;
				}
			}
		}
		return bool;
	}
	
}