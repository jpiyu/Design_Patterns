package Strategy;
import static java.lang.System.*;
public class Animal {

	String name;
	String sound;
	public Flys flyingType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String tryToFly()
	{
		return flyingType.fly();
	}
	public void setFlyingAbility(Flys flyingType)
	{
		this.flyingType = flyingType;
	}
	public void checkFlyingAbility()
	{
		System.out.println(flyingType.fly());
	}
}
