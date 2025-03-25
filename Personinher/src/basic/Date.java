package basic;

import java.io.Serializable;

public class Date implements Serializable{
	private int dd;
	private int month;
	private int year;
	public Date(int dd, int month, int year) {
		super();
		this.dd = dd;
		this.month = month;
		this.year = year;
	}
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDd() {
		return dd;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", month=" + month + ", year=" + year + "]";
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void display() {
		System.out.println(dd+"/"+month+"/"+year);
	}
	

}
