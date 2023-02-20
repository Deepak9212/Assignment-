package InheritanceActivity;

public class Employee {
long employeeId;
String employeeName;
String employee_Address;
long employee_Phone;
double basicSalary;
double specialAllowance=250;
double hra=1000;
//double transportAllowance;


public Employee(long Id,String Name,String Address,long phone) {
	this.employeeId=Id;
	this.employeeName=Name;
	this. employee_Phone=phone;
	this.employee_Address=Address;
	//this.basicSalary=Salary;
}
//method for calculating salary
void calculateSalary() {
	double salary=basicSalary+(basicSalary*specialAllowance/100) +(basicSalary*hra/100);
	System.out.println("Salary of"+employeeName+"+"+salary);
}
//adding default transport allowance method
void calculateTransportAllowance() {
	double transportAllowance=10* basicSalary/100;
	System.out.println(employeeName+"transportAllowance is :"+transportAllowance);
	
}}
//deriving manager class to employee class
class Manager extends Employee{//child class of Employee class
	public Manager(long Id,String Name,String Address,long phone,double Salary){//using basic class to overloading parent constructor
		super(Id ,Name,Address,phone);
		super.basicSalary=Salary;
	}
	
	void calculateTransportAllowance() {
		double transportAllowance=15*basicSalary/100;
		System.out.println(employeeName+"Transport Allowanceis:"+transportAllowance);
	}}
	class Trainee extends Employee{//child class of Employee class
		public Trainee(long Id,String Name,String Address,long phone,double Salary){//using basic class to overloading parent constructor
			super(Id ,Name,Address,phone);
			super.basicSalary=Salary;
		}
	}

