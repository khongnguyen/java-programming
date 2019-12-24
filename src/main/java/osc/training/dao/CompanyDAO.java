package osc.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import osc.training.model.Company;
import osc.training.utils.DBUtils;

public class CompanyDAO {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public Company getCompanyWithId(int company_id) throws Exception {
		Company company = null;
		try {
			String sql = "SELECT * FROM dbo.Company WHERE company_id = ?";
			connection = DBUtils.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, company_id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getNString(2);
				company = new Company(id, name);
			}
		} catch (Exception e) {
			System.err.println(e);
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
		return company;
	}

	public List<Company> getAllCompany() throws SQLException {
		List<Company> companies = new ArrayList<Company>();
		try {
			String sql = "SELECT * FROM dbo.Company";
			connection = DBUtils.getInstance().getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getNString(2);
				companies.add(new Company(id, name));
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (!resultSet.isClosed() || resultSet != null)
					resultSet.close();
				if (!statement.isClosed() || statement != null)
					statement.close();
				if (!connection.isClosed() || connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return companies;
	}

}
