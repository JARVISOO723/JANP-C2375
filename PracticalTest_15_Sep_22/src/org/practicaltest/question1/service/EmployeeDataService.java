package org.practicaltest.question1.service;

import org.practicaltest.question1.dao.EmployeeDataDAO;
import org.practicaltest.question1.model.EmployeeData;

public class EmployeeDataService {
	
		public static boolean addEmployeeData(EmployeeData emp) {
			boolean result=false;
			EmployeeDataDAO.addEmployeeData(emp);
			return result;
		}
		public static EmployeeData[] displayEmployeeDatas() {
			return EmployeeDataDAO.displayEmployeeDatas();
		}
	}


