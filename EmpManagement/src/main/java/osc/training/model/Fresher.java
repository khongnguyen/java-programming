package osc.training.model;

import osc.training.utils.EmpType;

public class Fresher extends Employee {
	public static final double SUBSIDIZE = 450;
	private int mangager_id;

	public Fresher() {
		super();
	}
	
	public Fresher(int id, String name, EmpType empType, int mangager_id) {
		super(id, name, empType, SUBSIDIZE);
		this.mangager_id = mangager_id;
	}

	public Fresher(int id, String name, EmpType empType, double salary, int mangager_id) {
		super(id, name, empType, salary);
		this.mangager_id = mangager_id;
	}

	public int getMangager_id() {
		return mangager_id;
	}

	public void setMangager_id(int mangager_id) {
		this.mangager_id = mangager_id;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(String.format("%-10d", mangager_id))
				.toString();
	}

}
