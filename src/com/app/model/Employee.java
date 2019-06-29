package com.app.model;

public class Employee {

int empid;
String ename;
int sal;
long phone;
int empdept;

Department department;
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public int getEmpdept() {
	return empdept;
}
public void setEmpdept(int empdept) {
	this.empdept = empdept;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}
