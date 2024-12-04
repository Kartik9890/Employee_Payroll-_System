
public class Main {

	public static void main(String[] args) {
System.out.println("IN MAIN");
PayrollSystem payrollSystem = new PayrollSystem();
String name;
int id;
double monthlySalary;
FullTimeEmployee emp1 = new  FullTimeEmployee(name="kartik", id=1, monthlySalary=70000.0);
	int hoursWorked;
	int hourlyRate;
	PartTimeEmployee emp2 = new PartTimeEmployee(name="vikas",id=2, hoursWorked=40,hourlyRate=100);
	
	payrollSystem.addEmployee(emp1);
	payrollSystem.addEmployee(emp2);
	
	System.out.println("initial employee details: ");
	payrollSystem.displayEmployees();
	
	System.out.println("Removing Employees");
	payrollSystem.removeEmployee(id=2);
	
	System.out.println("Remaining Employee Details");
	payrollSystem.displayEmployees();
	System.out.println("Process Finished");
	}

}
 