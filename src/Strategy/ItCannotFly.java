package Strategy;

public class ItCannotFly implements Flys{

	@Override
	public String fly() {
		return "It cannot fly";
	}

}
