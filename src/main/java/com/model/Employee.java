package com.model;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
/*@XmlType(propOrder={"userId","empName","password"})*/
public class Employee 
{
 private int empId;
 private String empName;
 private String password;
 
 public Employee() {
		super();
		// TODO Auto-generated constructor stub
 }
 
 public Employee(int empId, String empName, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
	}
 
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
