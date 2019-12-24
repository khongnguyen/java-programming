package osc.training.controller;

import java.sql.SQLException;
import java.util.List;

import osc.training.dao.CompanyDAO;
import osc.training.model.Company;

public class CompanyHandle {
	
	private CompanyDAO companyDAO = new CompanyDAO();
	
	public List<Company> getAllCompany() throws SQLException {
		return companyDAO.getAllCompany();
	}
	
	public boolean isCompanyExist(int company_id) {
		Company company = new Company();
		try {
			company = companyDAO.getCompanyWithId(company_id);
			if(company!=null)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		
	}

	public void display(List<Company> companies) {
		if (companies.size() != 0) {
			System.out.printf("%-3s%-15s\n\n", "ID", "Name");
			companies.forEach(o -> System.out.println(o));
		} else {
			System.out.println("EMPTY!");
		}
	}

}
