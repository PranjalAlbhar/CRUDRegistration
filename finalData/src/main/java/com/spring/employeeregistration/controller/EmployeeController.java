package com.spring.employeeregistration.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.employeeregistration.dao.EmployeeDao;
import com.spring.employeeregistration.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;

	static Logger logger = Logger.getLogger(EmployeeController.class.getName());

	@RequestMapping("/employee-registrationform")
	public String showform(Model m) {

		m.addAttribute("command", new EmployeeDao());
		return "employee-registrationform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee employee) {

		employeeDao.save(employee);
		return "redirect:/view";// will redirect to viewemp request mapping

	}

	@RequestMapping("/view")
	public String viewemp(Model model) {
		List<Employee> list = employeeDao.getEmployees();
		model.addAttribute("list", list);
		return "employee-viewdetails";
	}

	@RequestMapping(value = "/editemp/{emp_Id}", method = RequestMethod.GET)
	public String edit(@PathVariable int emp_Id, Model model) {
		Employee emp = employeeDao.getEmpById(emp_Id);
		model.addAttribute("command", emp);
		return "employee-editform";
	}

	@RequestMapping(value = "/editemp/editData", method = RequestMethod.POST)
	public String updateData(@ModelAttribute("emp") Employee employee) {
		int id=employee.getEmp_Id();
		logger.info("Inside Update url");
		employeeDao.update(employee,id);
		return "redirect:/view";
	}
	@RequestMapping(value = "/deleteemp/{emp_Id}", method = RequestMethod.GET)
	public String delete(@PathVariable int emp_Id) {
		logger.info("Inside delete mapping:");
		employeeDao.delete(emp_Id);
		return "redirect:/view";
	}
}
