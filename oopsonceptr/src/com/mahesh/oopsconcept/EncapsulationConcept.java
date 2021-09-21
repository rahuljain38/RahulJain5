package com.mahesh.oopsconcept;
class Employee
 {
	private int empId ;
	private String empName;
	private String deptName;
	private double empSalary;
	private long phoneNo;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", empSalary="
				+ empSalary + ", phoneNo=" + phoneNo + "]";
	}
	
	
 }
public class EncapsulationConcept {
public static void main(String[] args) {
	Employee emp =new Employee();
	emp.setDeptName("computer");
	emp.setEmpName("mangesh");
	emp.setEmpId(8400962);
	emp.setEmpSalary(15462.45);
	emp.setPhoneNo(9988556214l);
	System.out.println("employee id :"+emp.getEmpId());
	System.out.println("employee name : "+emp.getEmpName());
	System.out.println("department name :"+emp.getDeptName());
	System.out.println("employee salary : "+emp.getEmpSalary());
	System.out.println("contact number "+emp.getPhoneNo());
	
	
}
}
