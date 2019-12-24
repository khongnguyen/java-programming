package osc.training.controller;

import java.sql.SQLException;
import java.util.List;

import osc.training.dao.DepartmentDAO;
import osc.training.model.Department;

public class DepartmentHandle {
	
	private DepartmentDAO departmentDAO = new DepartmentDAO();
	
	public List<Department> getAllDepartment(int company_id) throws SQLException {
		return departmentDAO.getAllDepartment(company_id);
	}

	public void display(List<Department> departments) {
		if (departments.size() != 0) {
			System.out.printf("%-3s%-15s\n\n", "ID", "Name");
			departments.forEach(o -> System.out.println(o));
		} else {
			System.out.println("EMPTY!");
		}
	}
}
