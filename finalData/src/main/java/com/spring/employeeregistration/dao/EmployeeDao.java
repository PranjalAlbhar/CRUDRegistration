package com.spring.employeeregistration.dao;

import com.spring.employeeregistration.controller.EmployeeController;
import com.spring.employeeregistration.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	JdbcTemplate template;

	static Logger logger = Logger.getLogger( EmployeeDao.class.getName());
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee employee) {
		
		try {
			String saveQuery = "insert into Employee(emp_name, emp_mobileNumber, emp_mailId, password, emp_DOB, emp_gender, emp_address,emp_JDate,emp_department,emp_salary) values('"
					+ employee.getEmp_name() + "','" + employee.getEmp_mobileNumber() + "','" + employee.getEmp_mailId()
					+ "','" + employee.getPassword() + "', '" + employee.getEmp_DOB() + "','" + employee.getEmp_gender()
					+ "','" + employee.getEmp_address() + "','" + employee.getEmp_JDate() + "','"
					+ employee.getEmp_department() + "','" + employee.getEmp_salary() + "')";
			return template.update(saveQuery);
		} catch (Exception exception) {
			exception.printStackTrace();
			System.out.println("please check it " + exception.getMessage());
		}
		return 0;
	}

	/*
	 * public int update(Employee employee) { logger.info("inside update function");
	 * String updateQuery = "update Employee set emp_name='" +
	 * employee.getEmp_name() + "',emp_mobileNumber='" +
	 * employee.getEmp_mobileNumber() + "'" + ",emp_mailId='" +
	 * employee.getEmp_mailId() + "',password='" + employee.getPassword() +
	 * "',emp_DOB='" + employee.getEmp_DOB() + "'," + "emp_gender='" +
	 * employee.getEmp_gender() + "',emp_address='" + employee.getEmp_address() +
	 * "',emp_JDate='" + employee.getEmp_JDate() + "',emp_department='" +
	 * employee.getEmp_department() + "',emp_salary='" + employee.getEmp_salary()
	 * +"' where emp_Id='"+employee.getEmp_Id()+"'"; logger.info(updateQuery);
	 * return template.update(updateQuery);
	 * 
	 * }
	 */
	public int update(Employee employee,int emp_Id)
	{
		String updateQuery = "update Employee set emp_name='" + employee.getEmp_name() + "',emp_mobileNumber='"
				+ employee.getEmp_mobileNumber() + "'" + ",emp_mailId='" + employee.getEmp_mailId() + "',password='"
				+ employee.getPassword() + "',emp_DOB='" + employee.getEmp_DOB() + "'," + "emp_gender='"
				+ employee.getEmp_gender() + "',emp_address='" + employee.getEmp_address() + "',emp_JDate='"
				+ employee.getEmp_JDate() + "',emp_department='" + employee.getEmp_department() + "',emp_salary='"
				+ employee.getEmp_salary() + "' where  emp_Id='"+employee.getEmp_Id()+"'" ;

		return template.update(updateQuery);
	}
	
	public int delete(int emp_Id) {
		String sql = "delete from Employee where emp_Id=" + emp_Id + "";
	logger.info(sql);
		return template.update(sql);
	}

	public Employee getEmpById(int emp_Id) {
		String sql = "select * from Employee where emp_Id=?";
		return template.queryForObject(sql, new Object[] { emp_Id },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public List<Employee> getEmployees() {
		return template.query("select * from Employee", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet resultSet, int row) throws SQLException {

				Employee employee = new Employee();
				employee.setEmp_Id(resultSet.getInt(1));
				employee.setEmp_name(resultSet.getString(2));
				employee.setEmp_mobileNumber(resultSet.getString(3));
				employee.setEmp_mailId(resultSet.getString(4));
				employee.setPassword(resultSet.getString(5));
				employee.setEmp_DOB(resultSet.getString(6));
				employee.setEmp_gender(resultSet.getString(7));
				employee.setEmp_address(resultSet.getString(8));
				employee.setEmp_JDate(resultSet.getString(9));
				employee.setEmp_department(resultSet.getString(10));
				employee.setEmp_salary(resultSet.getFloat(11));
				return employee;

			}
		});

	}
}