package osc.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import osc.training.controller.CompanyHandle;
import osc.training.controller.DepartmentHandle;
import osc.training.controller.EmployeeHandle;
import osc.training.model.Company;

public class EmpManagement {

	public static void main(String[] args) {
		int companyChoice = 0, subSelectChoice = 0, departmentChoice = 0;
		CompanyHandle companyHandle = new CompanyHandle();
		DepartmentHandle departmentHandle = new DepartmentHandle();
		EmployeeHandle employeeHandle = new EmployeeHandle();
		List<Company> companies = new ArrayList<Company>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("DEMO JAVA CORE");
			try {
				companies = companyHandle.getAllCompany();
			} catch (Exception e) {
				System.err.println(e);
			}
			companyHandle.display(companies);
			System.out.println();
			System.out.print("Select your company (0 to break): ");
			try {
				companyChoice = Integer.parseInt(sc.nextLine());
				if (companyChoice != 0 && companyHandle.isCompanyExist(companyChoice)) {

					do {
						showMenu();
						try {
							subSelectChoice = Integer.parseInt(sc.nextLine());
							switch (subSelectChoice) {
							case 0:
								break;
							case 1:
								employeeHandle.display(employeeHandle.getAllEmployeeInCompany(companyChoice));
								break;
							case 2:
								departmentHandle.display(departmentHandle.getAllDepartment(companyChoice));
								System.out.println("Enter department ID: ");
								try {
									departmentChoice = Integer.parseInt(sc.nextLine());
									employeeHandle.display(employeeHandle.getAllEmployeeInDepartment(departmentChoice));
								} catch (Exception e) {
									System.err.println("Wrong type value");
								}
							default:
								break;
							}
						} catch (Exception e) {
							System.err.println("Wrong type value!");
						}
						System.out.println();
					} while (subSelectChoice != 0);
				} else if (companyChoice == 0) {
					break;
				} else {
					System.err.println("This ID not exits!");
					continue;
				}
			} catch (NumberFormatException e) {
				System.err.println("Whrong type number");
				continue;
			}
			System.out.println();
		} while (true);
		sc.close();
		System.out.println("HAVE A NICE DAY!");
	}

	public static void showMenu() {
		System.out.println("SELECT:");
		System.out.println("1. View emp all company");
		System.out.println("2. View emp by department ID:");
		System.out.print("Your select (0 to back): ");
	}
}
