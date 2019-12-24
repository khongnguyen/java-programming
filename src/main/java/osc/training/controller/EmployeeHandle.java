package osc.training.controller;

import java.sql.SQLException;
import java.util.List;

import osc.training.dao.EmployeeDAO;
import osc.training.model.Employee;
import osc.training.model.Fresher;
import osc.training.utils.EmpType;

public class EmployeeHandle {
	private EmployeeDAO employeeDAO = new EmployeeDAO();

	public List<Employee> getAllEmployeeInCompany(int company_id) throws SQLException {
		return employeeDAO.getAllEmpInCompany(company_id);
	}

	public List<Employee> getAllEmployeeInDepartment(int department_id) throws SQLException {
		return employeeDAO.getAllEmpInDepartment(department_id);
	}

	public void display(List<Employee> employees) {
		if (employees.size() != 0) {
			System.out.printf("%-3s%-15s%-15s%-15s%-10s\n\n", "ID", "Name", "Position", "Salary", "Manager ID");
			employees.forEach(o->{
				if(o.getEmpType()==EmpType.FRESHER) {
					System.out.println((Fresher) o);
				} else {
					System.out.println(o);
				}
			});
		} else {
			System.out.println("EMPTY!");
		}
	}
}
