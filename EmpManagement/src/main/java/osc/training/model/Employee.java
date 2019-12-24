package osc.training.model;

import osc.training.utils.EmpType;

public abstract class Employee {
	private int id;
	private String name;
	private EmpType empType;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, EmpType empType, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.empType = empType;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmpType getEmpType() {
		return empType;
	}

	public void setEmpType(EmpType empType) {
		this.empType = empType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%-3d%-15s%-15s%-15.2f", id, name, empType, salary);
	}

}
