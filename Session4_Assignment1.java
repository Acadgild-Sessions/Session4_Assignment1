import java.util.*;

class Employee {
	private String eId;
	private String eName;
	private int eSal;
	private String eDOJ;
	private String eDesg;
	
	public void setEId(String neweId){
		eId = neweId;
	}
	public String getEId(){
		return eId;
	}
	public void setEName(String neweName){
		eName = neweName;
	}
	public String getEName(){
		return eName;
	}
	public void setESal(int neweSal){
		eSal = neweSal;
	}
	public int getESal(){
		return eSal;
	}
	public void setEDOJ(String neweDOJ){
		eDOJ = neweDOJ;
	}
	public String getEDOJ(){
		return eDOJ;
	}
	public void setEDesg(String neweDesg){
		eDesg = neweDesg;
	}
	public String getEDesg(){
		return eDesg;
	}
}

class Session4_Assignment1{
	public static void main(String args []){
		Employee emp = new Employee();
		String id, name, doj,desg;
		int sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter of Employee Details:");
		
		System.out.print("\nEnter of Employee Id : ");
		id=sc.nextLine();
		System.out.print("Enter of Employee Name : ");
		name=sc.nextLine();
		System.out.print("Enter of Employee Date of Joining(DD-M-YYYY) : ");
		doj=sc.nextLine();
		System.out.print("Enter of Employee Designation : ");
		desg=sc.nextLine();
		System.out.print("Enter of Employee Salary : ");
		sal=sc.nextInt();
		
		emp.setEId(id);
		emp.setEName(name);
		emp.setESal(sal);
		emp.setEDOJ(doj);
		emp.setEDesg(desg);
		
		System.out.println("\n\nDetails of Employee:\n"
							+"\nEmployee Id : "+emp.getEId()
							+"\nEmployee Name : "+emp.getEName()
							+"\nEmployee Date of Joining : "+emp.getEDOJ()
							+"\nEmployee Designation : "+emp.getEDesg());
	}
}
