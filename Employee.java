
public class Employee extends Person {
	private String office;
	private double salary;
	private String datehired;
	

	Employee(String name, int phonenumber,String emailaddress,String office,double salary,String datehired){
		super(name, phonenumber, emailaddress);
		this.office = office;
		this.salary = salary;
		this.datehired = datehired;
	}
	
	public String toString() {
		
		return super.toString()+ "| Office: "+ office + "| Salary: " + salary+" SR " + "| DateHired: " + datehired ;
		
	}
	
}
