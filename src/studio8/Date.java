package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int day;
	private int month; 
	private int year;
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
    public static void main(String[] args) {
    	Date a = new Date(1, 2, 2003);
    	Date b = new Date(4, 4, 2006);
    	Date c = new Date (12, 10, 2003);
    	Date d = new Date (11, 21, 2003);
    	Date e = new Date (8, 15, 2003);
    	LinkedList<Date> dates = new LinkedList<Date>();
    	dates.add(a);
    	dates.add(b);
    	dates.add(c);
    	dates.add(d);
    	dates.add(e);
    	System.out.println(dates);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	System.out.println(set);
    }
    public String toString() {
    	return day + "/" + month + "/" + year;
    }
	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

}
