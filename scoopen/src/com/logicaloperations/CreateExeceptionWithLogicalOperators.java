package com.logicaloperations;

public class CreateExeceptionWithLogicalOperators {
	
	
	
public static void main(String[] args) throws Exception {
	
	Place pa= new Place("Sangli", 416416);
	Employee e1 = new Employee("Abhijeet", 10000, 27, pa);
	
	boolean flag=false;
	try {
		flag = verifyEmployee(e1);
	} catch (InvalidAgeException | SalaryException | InvalidAddressException e) {
		e.printStackTrace();
	}
	String option = flag ? "Yes" : "No";
	
	System.out.println("IS Employee Details correct  :-"+option);
}//main closes
	
	
private static boolean verifyEmployee(Employee e1) throws InvalidAgeException,SalaryException, InvalidAddressException,Exception
{
	
	if(null==e1 || e1.getPlacechaAddress()==null)
		throw new Exception("Objcets Cannot be null");
	
	else if(e1.getEmpAge()<21)
		throw new InvalidAgeException("Ajun barka porga ahe..");
	
	else if(e1.getEmpSalary()<10000)
		throw new SalaryException("Salary kami ahe...");
	
	
	
	else {
		
		String s = String.valueOf(e1.getPlacechaAddress().getPinCode());
		
		
		
		if(!(e1.getPlacechaAddress().getCityName()!=null && s.length()==6))
			throw new InvalidAddressException("Amhi sanglikar...!");
	}
	
	return true;
}




	

}//public class closes

class Employee
{
		 private String empName;
		 private double empSalary;
		 private int empAge;
		 private Place placechaAddress;
		 
		public Employee(String empName, double empSalary, int empAge, Place placechaAddress) {
			super();
			this.empName = empName;
			this.empSalary = empSalary;
			this.empAge = empAge;
			this.placechaAddress = placechaAddress;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
		public Place getPlacechaAddress() {
			return placechaAddress;
		}
		public void setPlacechaAddress(Place placechaAddress) {
			this.placechaAddress = placechaAddress;
		}
		@Override
		public String toString() {
			return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
					+ ", placechaAddress=" + placechaAddress + "]";
		}
		 
		 
		 	
		 
		 
}
class Place
{
	
	
	public Place(String cityName, int pinCode) {
		super();
		this.cityName = cityName;
		this.pinCode = pinCode;
	}
	private String cityName;
	private int pinCode;
	@Override
	public String toString() {
		return "Place [cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}//class place closes

class InvalidAgeException extends Exception
{

	public InvalidAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class SalaryException extends Exception
{

	public SalaryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class InvalidAddressException extends Exception
{
	public InvalidAddressException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	}//class InvalidAddressException closes
