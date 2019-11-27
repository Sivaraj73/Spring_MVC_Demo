package com.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;

@RestController
public class EmployeeController 

{
  @RequestMapping(value="/one",method=RequestMethod.GET)
  public String hiHello()
  {
	  System.out.println("into hi hello method");
	  return "Hi Hello Vanakam";
  }
  
  @RequestMapping(value="/two",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
  public Employee getUser()
  {
	  return new Employee(1234,"Lunch", "break");
  }
  
  @RequestMapping(value="/three",method=RequestMethod.GET)
  public Employee getUserById(@RequestParam("alias") long empId)
  {
	  Employee employee=null;
	  if(empId==1)
	  {
		  employee=new Employee(1,"siva","SR's world");
	  }
	  else if(empId==2)
	  {
		  employee=new Employee(2,"venk","world");
	  }
	  return employee;
  }
  @PostMapping(value="/four")
  public Employee createEmployee(@RequestBody Employee employee)
  {
	  System.out.println("from ui empId"+employee.getEmpId());
	  System.out.println("from ui empNAme"+employee.getEmpName());
	  System.out.println("from ui password"+employee.getPassword());
	  employee.setEmpName("welcome"+employee.getEmpName());
	  
	  System.out.println("gyughghh");
	 return employee; 
  }
}
