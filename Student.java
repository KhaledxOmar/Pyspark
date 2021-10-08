
public class Student extends Person{
	private String status;
	private double GPA;
	
	Student(String name, int phonenumber,String emailaddress,String status,double GPA){
		super(  name,  phonenumber, emailaddress);
		this.status = status;
		this.GPA = GPA;
	}
	
	public String toString() {
		
		return super.toString() + " | Status : " + status + " | GPA : " + GPA ;
	}
	
}
