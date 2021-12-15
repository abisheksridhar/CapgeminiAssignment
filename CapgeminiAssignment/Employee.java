package CapgeminiAssignment;


class EmployeeObject {

		//Declaring the variables
		//Employee is a Object
		//Employee has a employee name,city,and work location
		String Ename;
		String ProperCity;
		String Location;
		//Constructor
		public EmployeeObject(String ename, String ProperCity, String Location) {
			Ename = ename;
			this.ProperCity = ProperCity;
			this.Location = Location;
		}
		//Creating method
		void EmployeeDetails()
		{
			//Printing Employee Details
			System.out.println("Employee name is: "+Ename);
			System.out.println("Employee Proper location is: "+ProperCity);
			System.out.println("Employee Working location is: "+Location);
		}
		
	}


public class Employee {
	public static void main(String[] args) 
	{
		//Creating objects for the class
		EmployeeObject obj1=new EmployeeObject("Ram","Hyd","Mumbai");
		EmployeeObject obj2=new EmployeeObject("Rakesh","Chennai","Mumbai");
		EmployeeObject obj3=new EmployeeObject("Rishi","Hyd","Mumbai");
		System.out.println("\n\n");
		//Method calling with object reference
		obj1.EmployeeDetails();
		System.out.println("\n\n");
		obj2.EmployeeDetails();
		System.out.println("\n\n");
		obj3.EmployeeDetails();
		System.out.println("\n\n");
		
	}

}
