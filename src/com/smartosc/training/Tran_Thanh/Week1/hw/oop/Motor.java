package com.smartosc.training.Tran_Thanh.Week1.hw.oop;

public class Motor extends Vehicle{
	private int year;
	private Type type;
	
	static final int CURRENT_YEAR = 2019;
	
	
	public Motor(String name, int price, int year, Type type) {
		super(name, price);
		if (year < 2000) {
            throw new IllegalArgumentException();
        }
		this.year = year;
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 2000) {
            throw new IllegalArgumentException();
        }
		this.year = year;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	int calUsedYear() {
		return CURRENT_YEAR - this.year;
	}

	String saleCod() {
		return "RES"+this.name;
	}
	@Override
	public String toString() {
		return "Motor [year=" + year + ", type=" + type + 
				", Time has been used" + calUsedYear() + "year(s)/ reselling cod"+ saleCod()+"]";
	}
}
