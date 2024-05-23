package com.example.springbhootcrudapp.app.controller;

import java.util.ArrayList;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbhootcrudapp.app.model.Employee;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class EmployeeController
{
	//Logger log=LoggerFactory.getLogger(EmployeeController.class);
	 @PostMapping("/saveEmp")
	 public Employee saveEmployee()
	 {
		 Employee e =new Employee();
		 e.setEid(111);
		 e.setEname("anjali");
		 e.setSalary(60000.0);
		 log.info("info() Emp data saved....");
		 log.warn("warn() Emp data saved....");
		 log.debug("debug() Emp data saved....");
		 log.trace("trace() Emp data saved....");
		 log.error("error() Emp data saved....");
		return e;
		
	 }	 
	 
	 

	 
	@GetMapping("/getAllEmp")
	public List<Employee> getAll()
	{
		List<Employee> eList =new ArrayList<Employee>();
		eList.add(new Employee(111,"anu",70000.0));
		eList.add(new Employee(112,"kiran",60000.0));
		eList.add(new Employee(114,"ashu",8000.0));
		eList.add(new Employee(114,"neha",90000.0));
		log.info("{}",eList);
		
		
		
		try
		 {
			 int a=10/0;
		 }
	
		catch (ArithmeticException e) {
			log.error(e.getMessage());
		}
  return eList;
}
}