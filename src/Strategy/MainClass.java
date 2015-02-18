package Strategy;

public class MainClass {
	public static void main(String[] args)
	{
		Animal dog = new Dog("Tommy");
		Animal cat = new Cat("Ruby");
		dog.checkFlyingAbility();
		cat.checkFlyingAbility();
		dog.setFlyingAbility(new ItFlys());
		cat.setFlyingAbility(new ItCannotFly());
		System.out.println("NOW THE FLYING ABILITIES HAVE BEEN CHANGED ----");
		dog.checkFlyingAbility();
		cat.checkFlyingAbility();
		
	}
}
