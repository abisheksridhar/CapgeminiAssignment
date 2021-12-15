package CapgeminiAssignment;

class Animal
{
	String name;
	String Sound;
	int NoOfLegs;
	Animal (String name, String sound, int noOfLegs) {
		this.name = name;
		Sound = sound;
		NoOfLegs = noOfLegs;
	}
	void AnimalDetails()
	{
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Sound: "+Sound);
		System.out.println("Animal NoOfLegs: "+NoOfLegs);
	}
}


public class MultipleObject
{
	
	public static void main(String[] args) 
	{
		Animal obj1=new Animal("Dog","Bow...Bow...",4);
		Animal obj2=new Animal("Cat","meow...meow...",4);
		Animal obj3=new Animal("Snake","ssssuu...ssssuuu...",0);	
	    System.out.println("=========================");
		obj1.AnimalDetails();
		System.out.println("=========================");
	    obj2.AnimalDetails();
	    System.out.println("=========================");
	    obj3.AnimalDetails();
	    System.out.println("=========================");
	}

}