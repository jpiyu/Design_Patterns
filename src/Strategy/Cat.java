package Strategy;

public class Cat extends Animal {
	Cat(String name)
	{
		setName(name);
		setSound("meow");
		flyingType = new ItFlys();
	}
	public void digHole()
	{
		System.out.println("Dig a hole with claws");
	}
}
