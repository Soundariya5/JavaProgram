package assignments;

public class EmployeeDetails { 
	public void printEmployeeName(String empName,int empId) {
    System.out.println("empName,empId-"+empName+","+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress-"+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("empSalary-"+empSalary);
	}
	public void printEmployeeMobileNo(long empMobile) {
		System.out.println("empMobile-"+empMobile);
	}
	public static void main(String[] args) {
		EmployeeDetails det=new EmployeeDetails();
		det.printEmployeeName("Sound",20);
		det.getEmployeeAddress("Coimbatore");
		det.printEmployeeSalary(5637.50);
		det.printEmployeeMobileNo(8546826287l);
	}

}
