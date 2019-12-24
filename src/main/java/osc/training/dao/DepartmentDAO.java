package osc.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import osc.training.model.Department;
import osc.training.utils.DBUtils;

public class DepartmentDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public List<Department> getAllDepartment(int company_id) throws SQLException {
		List<Department> departments = new ArrayList<Department>();
		try {
			String sql = "SELECT * FROM dbo.Department WHERE company_id = ?";
			connection = DBUtils.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, company_id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getNString(2);
				departments.add(new Department(id, name));
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
		return departments;
	}

}
