package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int minute;
	private int hour; 
	public Time(int minute, int hour) {
		this.minute = minute;
		this.hour = hour;
	}
	public static void main(String[] args) {
		Time a = new Time(59, 5);
		Time b = new Time (34, 6);
		Time c = new Time (22, 3);
		Time d = new Time (50, 2); 
		Time e = new Time (12, 1);
		LinkedList<Time> time = new LinkedList<Time>();
		time.add(a);
		time.add(b);
		time.add(c);
		time.add(d);
		time.add(e);
		System.out.println(time);
    	HashSet<Time> other = new HashSet<Time>();
    	other.add(a);
    	other.add(b);
    	other.add(c);
    	other.add(d);
    	other.add(e);
    	System.out.println(other);
    	
    }
	  public String toString() {
	    	return hour + ":" + minute;
	    }
	@Override
	public int hashCode() {
		return Objects.hash(minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return minute == other.minute;
	}

}