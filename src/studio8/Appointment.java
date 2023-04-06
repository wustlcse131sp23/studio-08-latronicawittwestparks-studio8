package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Appointment {
	private Date date;
	private Time time; 
	public Appointment(Date date, Time time) {
		this.time = time;
		this.date = date;
	}
	public static void main(String[] args) {
		Date z = new Date(1, 2, 2003);
    	Date y = new Date(4, 4, 2006);
    	Date x = new Date (12, 10, 2003);
    	Date w = new Date (11, 21, 2003);
    	Date v = new Date (8, 15, 2003);
    	
    	Time a = new Time(59, 5);
		Time b = new Time (34, 6);
		Time c = new Time (22, 3);
		Time d = new Time (50, 2); 
		Time e = new Time (12, 1);
		
		Appointment p = new Appointment(z, a);
		Appointment q = new Appointment(y, b);
		Appointment h = new Appointment(w, c);
		Appointment o = new Appointment(v, e);
		Appointment n = new Appointment(x, d);
		LinkedList<Appointment> one  = new LinkedList<Appointment>();
		one.add(p);
		one.add(o);
		one.add(n);
		one.add(q);
		one.add(h);
		System.out.println(one);
    	HashSet<Appointment> two = new HashSet<Appointment>();
    	two.add(p);
		two.add(o);
		two.add(n);
		two.add(q);
		two.add(h);
	System.out.println(two);

	}
	  public String toString() {
	    	return date + ": " + time;
	    }
}
