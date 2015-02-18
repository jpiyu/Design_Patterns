package Strategy;

import org.omg.CORBA.SetOverrideTypeHelper;

public class Dog extends Animal{
	public void digHole()
	{
		System.out.println("Dig a hole with paws");
	}
	Dog(String name)
	{
		setName(name);
		setSound("bark");
		flyingType = new ItCannotFly();
	}
	
}
