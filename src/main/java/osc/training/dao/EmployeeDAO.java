package osc.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import osc.training.model.Employee;
import osc.training.model.Fresher;
import osc.training.model.Manager;
import osc.training.utils.DBUtils;
import osc.training.utils.EmpType;

public class EmployeeDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public List<Employee> getAllEmpInCompany(int company_id) throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			String sql = "SELECT * FROM dbo.Employee " + 
					"WHERE department_id IN "
					+ "(SELECT department_id FROM dbo.Department WHERE company_id = ?)";
			connection = DBUtils.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, company_id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getNString(2);
				EmpType empType = resultSet.getNString(3).equalsIgnoreCase(EmpType.FRESHER.toString()) ? EmpType.FRESHER
						: EmpType.MANAGER;
				double salary = resultSet.getDouble(4);
				if (empType == EmpType.FRESHER) {
					int mananger_id = resultSet.getInt(5);
					employees.add(new Fresher(id, name, empType, salary, mananger_id));
				} else {
					employees.add(new Manager(id, name, empType, salary));
				}
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (!resultSet.isClosed() || resultSet != null)
					resultSet.close();
				if (!preparedStatement.isClosed() || preparedStatement != null)
					preparedStatement.close();
				if (!connection.isClosed() || connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return employees;
	}

	public List<Employee> getAllEmpInDepartment(int department_id) throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			String sql = "SELECT * FROM dbo.Employee WHERE department_id = ?";
			connection = DBUtils.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, department_id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getNString(2);
				EmpType empType = resultSet.getNString(3).equalsIgnoreCase(EmpType.FRESHER.toString()) ? EmpType.FRESHER
						: EmpType.MANAGER;
				double salary = resultSet.getDouble(4);
				if (empType == EmpType.FRESHER) {
					int mananger_id = resultSet.getInt(5);
					employees.add(new Fresher(id, name, empType, salary, mananger_id));
				} else {
					employees.add(new Manager(id, name, empType, salary));
				}
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (!resultSet.isClosed() || resultSet != null)
					resultSet.close();
				if (!preparedStatement.isClosed() || preparedStatement != null)
					preparedStatement.close();
				if (!connection.isClosed() || connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return employees;
	}
}
