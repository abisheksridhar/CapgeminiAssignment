package CapgeminiAssignment;
 class CarObject {
	String Carname;
	String model;
	double price;
	public CarObject(String carname, String model, double price) {
		Carname = carname;
		this.model = model;
		this.price = price;
	}
	void CarDetails()
	{
		System.out.println("Car name is: "+Carname);
		System.out.println("Car model is: "+model);
		System.out.println("Car price is: "+price);
	}

}

public class Car {
	public static void main(String[] args)
	{
		CarObject obj1=new CarObject("BMW","2021",100000);
		CarObject obj2=new CarObject("RR","2020",200000);
		CarObject obj3=new CarObject("Audi","2019",750000);
		System.out.println("\n");
		obj1.CarDetails();
		System.out.println("\n");
		obj2.CarDetails();
		System.out.println("\n");
		obj3.CarDetails();
		System.out.println("\n");	
	}

}
